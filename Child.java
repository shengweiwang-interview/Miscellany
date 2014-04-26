package jc;

// this example is to show the constructor inheritance

public class Child extends Parent {

	int child_a;
	int child_b;
	int child_c;
	
	public Child(int x, int y, int z){
		
		child_a = 1;
		child_b = 2;
		child_c = 3;
	}
	
	
	
	public static void main(String[] args){
		
		Child mychild = new Child(7,8,9);
		System.out.println(mychild.child_a + "\t" + mychild.child_b + "\t" + mychild.child_c );
		
	}
	
}
