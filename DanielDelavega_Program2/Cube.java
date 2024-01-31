//********************************************************
//Programmer: Daniel Isacc Delavega
//
//Cube.java
//
//********************************************************
//This class is designed to calculate and return
//the area and volume of the ThreeDimensionalShape Cube
//********************************************************
import java.lang.Math;
//imported math for .pow()
public class Cube extends ThreeDimensionalShape{

	private final String shape = "Cube";
	//variables used to store math values
	private double edge;
	private double sqrArea;
	
	public Cube(double edge) {
		//Instantiate and calculate necessary math values
		this.edge = edge;
		this.sqrArea = Math.pow(edge,2);
	}
	@Override
	public double getVolume() {
		//method to calculate and return volume of a cube
		double volume = edge*sqrArea;
		return volume;
	}

	@Override
	public double getArea() {
		//method to calculate and return area of a cube
		double cubeArea = 6*sqrArea;
		return cubeArea;
	}
	@Override
	public String getShape() {
		return shape;
	}

}
