//***********************************************************
/*
*	Student Name - Daniel Isacc Delavega

*	Professor Name - Fred Kumi

*	Assignment - Program Assignment 5

*	Assignment Due Date - March 23, 2024

*	Course - Java Programming Intermediate

*	Section Number - 002

*	Java File Name - Invoice.java
*/
//***********************************************************

//This class is used to create instances of Invoice objects that contain information about invoices.
public class Invoice {

	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	//constructor
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	
	
	//getters
	public String getPartNumber() {
		return this.partNumber;
	}
	
	public String getPartDescription() {
		return this.partDescription;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public double getPricePerItem() {
		return this.pricePerItem;
	}
	
	
	//override the toString method
	@Override
	public String toString() {
		return String.format("Part Description: %s%n"
						   + "Part Number: %s%n"
						   + "Part Quantity: %d%n"
						   + "Part Price: %f%n", 
						   partDescription, partNumber, 
						   quantity, pricePerItem);
	}
}
