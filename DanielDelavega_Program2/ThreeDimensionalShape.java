//********************************************************
//Programmer: Daniel Isacc Delavega
//
//ThreeDimensionalShape.java
//
//********************************************************
//This class is designed to be an abstract super class for
//three dimensional shapes and includes the inherited method
//getArea() from it's superclass Shapes.java and adds
//getShape() which is designed to process it's subclasses into Strings
//getVolume() which is designed for subclasses to calculate Volume and
//process the output into string format using the toString override.
//*********************************************************

public abstract class ThreeDimensionalShape extends Shape{

	private String shape;
	
	public String getShape() {
		//method designed for polymorphism to use in super toString
		return this.shape;
	}
	@Override
	public String toString() {
		return String.format("Shape: %s%nDimension: Three-Dimensional%nArea: %.2f%nVolume: %.2f%n%n",
				getShape(),getArea(),getVolume());
	}
	public abstract double getVolume();

}
