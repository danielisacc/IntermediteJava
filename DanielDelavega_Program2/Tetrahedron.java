//********************************************************
//Programmer: Daniel Isacc Delavega
//
//Tetrahedron.java
//
//********************************************************
//This class is designed to calculate and return
//the area and volume of the ThreeDimensionalShape Tetrahedron
//********************************************************
import java.lang.Math;
public class Tetrahedron extends ThreeDimensionalShape{

	//Variable Declaration
	private final String shape = "Tetrahedron";
	private double edge;
	
	//Constructor
	public Tetrahedron(double edge) {
		this.edge = edge;
	}
	@Override
	public double getVolume() {
		//calculate volume using a^3/6*sqrt(2)
		double volume = Math.pow(edge,3)/(6*Math.sqrt(2));
		return volume;
	}

	@Override
	public double getArea() {
		//calculate are using sqrt(3) * a^2
		double area = Math.sqrt(3)*Math.pow(edge, 2);
		return area;
	}
	
	@Override
	public String getShape() {
		//override of getShape to output using super.toString()
		return shape;
	}

}
