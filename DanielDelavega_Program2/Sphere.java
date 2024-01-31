//********************************************************
//Programmer: Daniel Isacc Delavega
//
//Sphere.java
//
//********************************************************
//This class is designed to calculate and return
//the area and volume of the ThreeDimensionalShape Sphere
//********************************************************
import java.lang.Math;
//imported math for pow()
public class Sphere extends ThreeDimensionalShape{

	private final String shape = "Sphere";
	
	//variables to hold math values
	private double radius;
	private double rsqr;
	
	
	public Sphere(double radius) {
		this.radius = radius;
		//instantiate rsqr with radius squared
		this.rsqr = Math.pow(radius,2);
	}

	@Override
	public double getArea() {
		//calculate area by multiplying 4*PI*radius^2
		double area = 4*PI*rsqr;
		return area;
	}

	@Override
	public double getVolume() {
		//Calculate volume by dividing 4*PI*radius^3 by 3
		double volume = (4*PI*(rsqr*radius))/3;
		return volume;
	}
	
	@Override
	public String getShape() {
		//method designed for polymorphism to use in super toString
		return this.shape;
	}
}
