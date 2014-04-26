package jc;
import java.util.*;
import java.lang.*;

public class lab_2 {

	public static void main(String[] args){
	
	int[] ia = {1,2,3};	
	Integer[] ia_wrapper = {new Integer(1), new Integer(2)};
	// you can convert array to type a to list of type a (not b)
	//List<Integer> list1 = Arrays.asList(ia);
	List<Integer> list2 = Arrays.asList(ia_wrapper);

	}
}