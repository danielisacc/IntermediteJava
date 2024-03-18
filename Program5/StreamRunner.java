//***********************************************************
/*
*	Student Name - Daniel Isacc Delavega

*	Professor Name - Fred Kumi

*	Assignment - Program Assignment 5

*	Assignment Due Date - March 23, 2024

*	Course - Java Programming Intermediate

*	Section Number - 002

*	Java File Name - StreamRunner.java
*/
//***********************************************************

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//class designed to act as the runner, performing the stream manipulations required for the assignment
//this includes, sorting, filtering, and mapping
public class StreamRunner {

	public List<Invoice> fileReader() {
		List<Invoice> invArray = new ArrayList<>();
		try {
			Stream<Invoice> fileStream = Files.lines(Paths.get("Program5.txt")).map(invoice -> {
				String[] parts = invoice.split(",");
				return new Invoice(parts[0],parts[1],Integer.parseInt(parts[2]), Double.parseDouble(parts[3]));
				});
			fileStream.forEach(invoice -> invArray.add(invoice));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return invArray;
	}
	public void sorter(List<Invoice> invArray) {
		//stream to sort based on the partDescription
		System.out.println("\n\nSorted on partDescription\n\n");
		invArray.stream()
				.sorted(Comparator.comparing(o -> o.getPartDescription()))
				.forEach(System.out::println);
		
		//stream to sort based on the pricePerItem
		System.out.println("\n\nSorted on pricePerItem\n\n");
		invArray.stream()
				.sorted(Comparator.comparing(o -> o.getPricePerItem()))
				.forEach(System.out::println);
		
		//stream to map each invoice to its partDescription and its quantity.
		//sort the results by quantity
		System.out.println("\n\nMapped partDescription:Quantity\n\n");
		
		//create a map using the partDescription as the key and the quantity as the value
		Map<String, Integer> partDescriptionToQuantityMap = invArray.stream()
				.collect(Collectors.toMap(Invoice::getPartDescription, Invoice::getQuantity));
		
		//create a list of sorted map key value pairs
		partDescriptionToQuantityMap.entrySet().stream()
	            .sorted(Map.Entry.comparingByValue())
	            .collect(Collectors.toList())
	            .forEach(entry ->
					System.out.println(String.format("Description: %s%nQuantity: %d%n",
						entry.getKey(), entry.getValue())));

		//stream to Map each invoice to its partDescription and the vale of the invoice.
		//(i.e. quantity * pricePerItem). Order the results by Value
		System.out.println("\n\nMapped partDescription:Value\n\n");
		
		//Create a map of using partDescription as the key and its value as the value
		Map<String, Double> partDescriptionToValueMap = invArray.stream()
				.collect(Collectors.toMap(Invoice::getPartDescription,
						invoice -> invoice.getPricePerItem() * invoice.getQuantity()));
		
		//create a sorted list of the key value pair
		partDescriptionToValueMap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.forEach(entry ->
					System.out.println(String.format("Description: %s%nValue: %f%n",
							entry.getKey(), entry.getValue())));
		
		//stream to Map each invoice to its partDescription and the vale of the invoice.
		//(i.e. quantity * pricePerItem). Order the results by Value
		
		System.out.println("\n\nMapped partDescription:Value between 200 and 500 value\n\n");
		
		//filter the partDescriptionToValueMap to display results that are between 200 and 500 and display results
		partDescriptionToValueMap.entrySet().stream()
				.filter(entry -> entry.getValue() >= 200.00 && entry.getValue() <= 500.00)
				.sorted(Map.Entry.comparingByValue())
				.forEach(entry ->
					System.out.println(String.format("Description: %s%nValue: %f%n",
							entry.getKey(), entry.getValue())));
		
		//stream to find any one invoice in which the partDescription contains the word "Saw"
		System.out.println("\n\nFind any one invoice in which the partDescription contains the word Saw\n\n");
		
		invArray.stream()
				.filter(invoice -> invoice.getPartDescription().contains("Saw"))
				.findFirst()
				.ifPresent(invoice -> System.out.println("Found Invoice:\n" + invoice));
		
	}
}
