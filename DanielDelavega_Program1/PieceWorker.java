//***********************************************************
//
//Student Name - Daniel Isacc Delavega
//
//Professor Name - Fred Kumi
//
//Assignment - Program Assignment 1
//
//Assignment Due Date - February 7th, 2024
//
//Course - Java Programming Intermediate
//
//Section Number - 002
//
//Java File Name - PieceWorker.java
//
//***********************************************************
public class PieceWorker extends Employee{
//PieceWorker is a subclass of abstract class Employee
//Objects from this class represent an employee whose pay is based on 
//number of pieces of merchandise produced
	//Class should include Private instance variable wage (double) & pieces (int)
	//wage stores the employee's wage per piece
	//pieces stores the number of pieces the employee produces
	private double wage;
	private int pieces;
	
	public PieceWorker(String firstName, String lastName, 
			String socialSecurityNumber, double wage, int pieces){
		//subclass constructor must explicitly inherit the superclass constructor's parameters
		super(firstName,lastName,socialSecurityNumber);
		this.wage = wage;
		this.pieces = pieces;
	}
	@Override
	public double earnings() {
		//This is an overridden method from class Employee
		//Method returns the calculated earnings for PieceWorker employee
		//Calculated by multiplying wage by pieces
		double earnings = this.wage * this.pieces;
		return earnings;
	}
	
	
	
}
