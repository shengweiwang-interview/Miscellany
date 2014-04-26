package jc;
import java.util.*;
import java.lang.*;

public class lab_2 {

	public static void main(String[] args){
	
	int[] ia = {1,2,3};	// primitive array
	Integer[] ia_wrapper = {new Integer(1), new Integer(2)}; // Integer object array
	//can convert an array of type a to a list of type a (rather than type b)
	//List<Integer> list1 = Arrays.asList(ia); this line is WRONG!!
	List<Integer> list2 = Arrays.asList(ia_wrapper);
	
	System.out.println(list2);

	}
}