//This code runs, so feel free to try it out
public class GenericExample {

	public static void main(String[] args) {
		
		Integer int1 = 1;
		String str1 = "2";
		Double dbl1 = 3.0;
		Long lng1 = 4L;
		
		Integer[] intArr = {5,6,7,8,9};
		Double[] dblArr = {5.0,6.0,7.0,9.0};
		
		OverloadedMethod intOverload = new OverloadedMethod(int1);
		OverloadedMethod strOverload = new OverloadedMethod(str1);
		OverloadedMethod dblOverload = new OverloadedMethod(dbl1);
		OverloadedMethod lngOverload = new OverloadedMethod(lng1);
		
		//notice that when declaring a generic class, the generic
		//parameters are entered in "<Integer>" on one side
		//but the other side only has "<>". This is because the ]
		//compiler infers the type from the declaration.
		GenericMethod<Integer> intGen = new GenericMethod<>(int1);
		
		GenericMethod<Integer> intArrGen = new GenericMethod<>(intArr);
	}
	
}

class OverloadedMethod {
	/* This class creates multiple overloaded constructors to add two objects and print the results
	 * 
	 * Although using overloaded methods in order to print each type of object works,
	 * it obviously is incredibly redundant and with every iteration of this overloaded constructor,
	 * the code is more and more error prone. There is a much easier way to write this with Generics.
	 */
	
	OverloadedMethod(Integer obj){
		//method to print an Integer
		System.out.println(obj);
	}

	OverloadedMethod(String obj){
		//method to print an String
		System.out.println(obj);
	}

	OverloadedMethod(Double obj){
		//method to print an double
		System.out.println(obj);
	}

	OverloadedMethod(Long obj){
		//method to print an Long
		System.out.println(obj);
	}
}

class GenericMethod<T>{ 
	//Notice that "T" is used as a placeholder in the class declaration
	
	/*
	 * Notice that in this version of the method, the same thing as the OverloadedMethod class Constructors
	 * is being accomplished, but instead of replicating it multiple times, only one constructor is necessary
	 */
	GenericMethod(T obj){
		//Notice that the same "T" defined in the class declaration is used here as a type argument for the parameter obj.
		System.out.println(obj);
	}
	
	GenericMethod(T[] obj){
		//Notice that I can even use the "T" type place holder within the body of methods as a type
		for(T num : obj){
			System.out.println(num);
		}
		
	}
}