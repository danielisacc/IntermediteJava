//********************************************************
//Programmer: Daniel Isacc Delavega
//
//TwoDimensionalShape.java
//
//********************************************************
//This class is designed to be an abstract superclass for
//two dimensional shapes and includes the inherited method
//getArea() from Shape and contains the two methods
//getShape() which is designed to get the shapes name
//and add it to the toString() Override
//*********************************************************

public abstract class TwoDimensionalShape extends Shape{
	private String shape;
	
	public String getShape() {
		//method designed for polymorphism to use in super toString
		return shape;
	}
	@Override
	public String toString() {
		//Overrides toString to print
		//"""Shape: this.shape
		//   Dimensions: Two-Dimensional
		//this.shape is intended to be polymorphic
		return String.format("Shape: %s%nDimension: Two-Dimensional%nArea: %.2f%n%n", 
				getShape(), getArea());
	}
}
