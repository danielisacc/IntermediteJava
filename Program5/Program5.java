/* ***************************************************************************************
 * 
 * Developer: Daniel Isacc Delavega
 * 
 * Program #: Five
 * 
 * File Name: Program5.java
 * 
 * Course: ITSE 2317 Intermediate Java Programming
 * 
 * Due Date: March 23, 2024
 * 
 * Instructor: Prof. Fred Kumi
 * 
 * ***************************************************************************************
 * 
 * Description: 
 * 	Use the class, Invoice, provided to create an array of Invoice objects in a test class
 * 	named Program5. Class Invoice includes four private instance variables; partNumber
 * 	(type String), partDescription (type String), quantity of the item being purchased (type
 * 	int), and pricePerItem (type double). Use Lambdas and Streams to perform the
 * 	following queries on the array of Invoice objects and display the results:
 * 
 * 		a. Sort the Invoice objects by partDescription, then display the results.
 * 		b. Sort the Invoice objects by pricePerItem, then display the results.
 * 		c. Map each Invoice to its partDescription and quantity, sort the results by quantity, then display the results.
 * 		d. Map each Invoice to its partDescription and the value of the Invoice (i.e., quantity pricePerItem). Order the results by Invoice value.
 * 		e. Modify Part (d) to select the Invoice values in the range $200.00 to $500.00.
 * 		f. Find any one Invoice in which the partDescription contains the word “Saw”.
 */


public class Program5 {

	public static void main(String[] args) {
		//create an instance of the Program5 obj since developerInfo is not static
		Program5 obj = new Program5();
		obj.developerInfo();
		
		//create an instance of StreamRunner to perform all the tasks of the program
		StreamRunner runner = new StreamRunner();
		runner.sorter(runner.fileReader());
		
	}
	
	public void developerInfo(){
		//method to print developer info
		System.out.println("\n\n*********Developer Information***********");
		System.out.println("\n\nName:    Daniel Isacc Delavega");
		System.out.println("\nCourse:  ITSE 2317 Intermediate Java Programming");
		System.out.println("\nProgram: Five\n\n");
		System.out.println("*****************************************");
	}
}
