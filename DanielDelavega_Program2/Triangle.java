//********************************************************
//Programmer: Daniel Isacc Delavega
//
//Triangle.java
//
//********************************************************
//This class is designed to calculate and return
//the area of the TwoDimensionalShape Triangle
//********************************************************

public class Triangle extends TwoDimensionalShape{
	
	//variable declaration
	private double base;
	private double height;
	private final String shape = "Triangle";
	
	public Triangle(double base, double height) {
		//Triangle constructor
		this.base = base;
		this.height = height;
	}
	
	@Override
	public String getShape() {
		//Override method of getShape to alter 
		//super.toString output to include this.shape
		return this.shape;
	}

	@Override
	public double getArea() {
		//getArea override that calculates the area of a Triangle
		//triangle area = (1/2)*base*height
		double area = base*height/2;
		//returns the area
		return area;
	}

}
