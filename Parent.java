package jc;

public class Parent {

	int a;
	int b;
	int c;
	
	// if provide a constructor with parameters in the parent class
	// the default constructor then no longer exists
	
	/*The programmer can write a no-argument constructor for a class.
      
      If the programmer does not write any constructors for a class, 
      then a no-argument constructor (called the default constructor) is automatically supplied.

      If the programmer writes even one constructor for a class 
      then the default constructor is not automatically supplied.*/
	
	// solution1: public Parent(){}
	public Parent(String myString){
		System.out.println("This is from the Parent");

	}
}
