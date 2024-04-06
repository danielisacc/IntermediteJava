//**************************************************************
// Developer: Daniel Delavega
//
// Program Number: Program7
//
// File Name: Program7.java
//
// Course Name: Intermediate Java Programming
//
// Due Date: 04-05-2024
//
// Instructor: Fred Kumi
//
// Chapter: 21
//
// Description: This program is designed to print array elements
// using generic methods.
//
//**************************************************************
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Program7 {
	
	//***********************************************************
	//
	// Method: main
	//
	// Description: The main method of the program
	//
	// Parameters: None
	//
	// Returns: N/A
	//
	//***********************************************************
	public static void main(String[] args){
		//print developer info
		Program7 obj = new Program7();
		obj.developerInfo();
		
		//create arrays of Integer, Double, and Character
		Integer[] intArr = {1, 2, 3, 4, 5};
		Double[] dblArr = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
		Character[] charArr = {'H', 'E', 'L', 'L', 'O'};
		
		
		//Display elements of the arrays
		System.out.printf("Array integerArray contains: ");
	    obj.printArray(intArr); // pass an Integer array
		  
	    System.out.printf("Array doubleArray contains: ");
	    obj.printArray(dblArr); // pass a Double array
		  
	    System.out.printf("Array characterArray contains: ");
	    obj.printArray(charArr); // pass a Character array
	    
	    //Display elements within a range
	    System.out.printf("Array integerArray contains: ");
	  	obj.printArray(intArr, 1, 4); // pass an Integer array
	  		  
	  	System.out.printf("%nArray doubleArray contains: ");
	  	obj.printArray(dblArr, 1, 4); // pass a Double array
	  		  
	  	System.out.printf("%nArray characterArray contains: ");
	  	obj.printArray(charArr, 1, 4); // pass a Character array
		
	}
	
	//***************************************************************
	//
	//  Method:       printArray (Non Static)
	// 
	//  Description:  A generic method to print the elements of an array
	//
	//  Parameters:   Array
	//
	//  Returns:      N/A 
	//
	//**************************************************************
	public <T> void printArray(T[] inputArray){
	  // display array elements            
	  for (T element : inputArray){       
	      System.out.printf("%s ", element);
	   }                                    

	  System.out.println();
	}
	
	//***********************************************************
	//
	// Method: printArray
	//
	// Description: prints the elements of an array that are within
	// the bounds of the given parameters
	//
	// Parameters: T[] inputArray, Integer lowSubscript, Integer highSubscript
	//
	// Returns: N/A
	//
	//***********************************************************
	public <T> void printArray(T[] inputArray, Integer lowSubscript, Integer highSubscript) {
		//Validate the subscript values
		if (lowSubscript < 0 || 
		   lowSubscript > inputArray.length - 1 ||
		   lowSubscript > highSubscript ||
		   highSubscript > inputArray.length - 1 ||
		   highSubscript < 0) {
			throw new InvalidSubscriptException();
		}
		 for(int i = lowSubscript; i <= highSubscript; i ++) {
			 System.out.printf("%s ", inputArray[i]);
		 }
		
	}
	

	//***********************************************************
	//
	// Method: developerInfo
	//
	// Description: The method to display the developer info on
	// the command line. 
	//
	// Parameters: None
	//
	// Returns: N/A
	//
	//***********************************************************
	public void developerInfo(){
		//method to print developer info
		System.out.println("\n\n*********Developer Information***********");
		System.out.println("\n\nName:    Daniel Isacc Delavega");
		System.out.println("\nCourse:  ITSE 2317 Intermediate Java Programming");
		System.out.println("\nProgram: 7\n\n");
		System.out.println("*****************************************");
	}
}

class InvalidSubscriptException extends RuntimeException {

	/**
	 * Exception class that extends RuntimeException and is used in Program7.
	 */
	private static final long serialVersionUID = 1L;
	
}