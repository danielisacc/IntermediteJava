//********************************************************
//Programmer: Daniel Isacc Delavega
//
//Cirlce.java
//
//********************************************************
//This class is designed to calculate and return
//the area of the TwoDimensionalShape Circle
//********************************************************
import java.lang.Math;
//java.lang.Math imported to use sqrt method
public class Circle extends TwoDimensionalShape{
	
	//variable declaration
	private double radius;
	private final String shape = "Circle";
	
	public Circle(double radius) {
		//Circle constructor
		this.radius = radius;
	}

	@Override
	public String getShape() {
		//Override method of getShape to alter 
		//super.toString output to include this.shape
		return this.shape;
	}

	@Override
	public double getArea() {
		//getArea override that calculates the area of a circle
		//circle area = PI*sqrt(radius)
		double area = PI*Math.sqrt(this.radius);
		return area;
	}
}
