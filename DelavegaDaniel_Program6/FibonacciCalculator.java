//**************************************************************
// Developer: Daniel Delavega
//
// Program Number: FibonacciCalculator
//
// File Name: FibonacciCalculator.java
//
// Course Name: Intermediate Java Programming
//
// Due Date: 03-29-2024
//
// Instructor: Fred Kumi
//
// Chapter: chapter
//
// Description: description
//
//**************************************************************

import java.math.BigInteger;
public class FibonacciCalculator {
	private BigInteger TWO = BigInteger.valueOf(2);
	private long calls = 0;
	
	
	public static void main(String[] args){
		/***********************************************************
		 *
		 * Method: main
		 *
		 * Description: main method to display the fibonacci number,
		 * time to calculate, and the number of recursive calls of
		 * all numbers from 1-40
		 *
		 * Parameters: args
		 *
		 * Returns: void
		 *
		 ************************************************************
		 */

		//print developer info
		FibonacciCalculator fib = new FibonacciCalculator();
		fib.developerInfo();
		
		// displays the fibonacci values from 0-40
	    for (int counter = 0; counter <= 40; counter++) {
	    	//get the time elapsed to calculate the recursive function
	    	Long start  = System.currentTimeMillis();
	  		
	  		//print the output fib number
	  		System.out.printf("%nFibonacci of %d is: %d%n", counter,
	  	            fib.fibonacci(BigInteger.valueOf(counter)));
	  		
	  		Long end = System.currentTimeMillis();
	  		Long runTime = end-start;
	  		
	  		//display the outputs
	  		System.out.println(String.format("   took %.2f seconds",runTime/1000.0));
	  		System.out.println(String.format("   took %d recursive calls%n", fib.calls));
		}
	}
	
	public BigInteger fibonacci(BigInteger number) {
		/***********************************************************
		 *
		 * Method: fibonacci
		 *
		 * Description: This is a recursive method to calculate the fibonacci number of a given number
		 *
		 * Parameters: number
		 *
		 * Returns: BigInteger
		 *
		 ************************************************************
		 */

		calls++;
		if (number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE)) { // base cases
	         return number;
	    }
	    else { // recursion step
	    	return fibonacci(number.subtract(BigInteger.ONE)).add(fibonacci(number.subtract(TWO)));
	      }
	   }
	
	
	public void developerInfo(){
		/***********************************************************
		 *
		 * Method: developerInfo
		 *
		 * Description: description
		 *
		 * Parameters: 
		 *
		 * Returns: void
		 *
		 ************************************************************
		 */

		System.out.println("\n\n*********Developer Information***********");
		System.out.println("\n\nName:    Daniel Isacc Delavega");
		System.out.println("\nCourse:  ITSE 2317 Intermediate Java Programming");
		System.out.println("\nProgram: Six\n\n");
		System.out.println("*****************************************");
	}  
} 


/*************************************************************************
* (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
* Pearson Education, Inc. All Rights Reserved.                           *
*                                                                        *
* DISCLAIMER: The authors and publisher of this book have used their     *
* best efforts in preparing the book. These efforts include the          *
* development, research, and testing of the theories and programs        *
* to determine their effectiveness. The authors and publisher make       *
* no warranty of any kind, expressed or implied, with regard to these    *
* programs or to the documentation contained in these books. The authors *
* and publisher shall not be liable in any event for incidental or       *
* consequential damages in connection with, or arising out of, the       *
* furnishing, performance, or use of these programs.                     *
*************************************************************************/