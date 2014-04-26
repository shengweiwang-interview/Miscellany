package jc;
import java.util.*;

public class NewThreadOne extends Thread {
	
	LinkedList myLinkedList = new LinkedList();
	
	//Optional: a constructor which contains this.start() 
	
	//Must override run(): inside run() can put a flag which can stop the thread
	@Override
	public void run(){
	
	 myLinkedList.add("First");
	 myLinkedList.add("Second");
	 myLinkedList.add("Third");

	 System.out.println(myLinkedList.get(0) + " This is from the child thread");
	 System.out.println(myLinkedList.get(1)+  " This is from the child thread");
	 System.out.println(myLinkedList.get(2)+ " This is from the child thread");
	
	}
	

}
