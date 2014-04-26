package jc;

// this example is to show the constructor inheritance

public class Child extends Parent {

	int child_a;
	int child_b;
	int child_c;
	
	

	public Child(int x, int y, int z){
   
		// what happens is : super(); the default super constructor is invoked
		// but it doesn't exist in the parent class (the programmer provides a non default one)
		// so there is an syntax error here.
		
		// solution1: explicitly provide a default constructor in parent class
		// solution2: explicitly invoke the non default constructor of the parent class
		
		// solution2 :super("Hello World");
		child_a = 1;
		child_b = 2;
		child_c = 3;
	}
	
	
	
	public static void main(String[] args){
		
		Child mychild = new Child(7,8,9);
		System.out.println(mychild.child_a + "\t" + mychild.child_b + "\t" + mychild.child_c );
		
	}
	
}
