//********************************************************
//Programmer: Daniel Isacc Delavega
//
//Square.java
//
//********************************************************
//This class is designed to calculate and return
//the area of the TwoDimensionalShape Square
//********************************************************

import java.lang.Math;
public class Square extends TwoDimensionalShape{
	
	//variable declaration
	private double length;
	private final String shape = "Square";
	
	public Square(double length) {
		//Square constructor
		this.length = length;
	}
	
	@Override
	public String getShape() {
		//Override method of getShape to alter 
		//super.toString output to include this.shape
		return this.shape;
	}

	@Override
	public double getArea() {
		//getArea override that calculates the area of a Square
		//Square area = length^2
		double area = Math.pow(length,2);
		//returns the area
		return area;
	}

}