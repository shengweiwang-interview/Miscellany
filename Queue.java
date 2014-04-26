package jc;

import java.util.*;

public class Queue {

	private LinkedList queue = new LinkedList();
	
	public void enQ(Object sth){
     queue.addLast(sth);
		
	}
	public Object deQ(){
		return queue.removeFirst();
	}
    
  
}
	
	
	

