package jc;

import java.util.*;

public class ProCon {
	
	static List<String> myListOne = new ArrayList<String>(); // a class object to store the strings
	
	public void produce(){
		
		synchronized(myListOne){
			myListOne.add("firstNameOne");
			myListOne.notifyAll(); // notice all waiting threads to stop waiting
			System.out.println("Adding finished and the current myListOne.size():  " + myListOne.size());
			
		}
	}
	
	public void consume() throws InterruptedException{
		
		synchronized(myListOne){
		while(myListOne.size()==0){
			System.out.println("Start waiting!!!!");
			myListOne.wait();
		}
		// while waiting if gets notice from produce method then stops waiting and continue execute following codes
		myListOne.remove(0);
		}
		System.out.println("Removing finished and the size is " + myListOne.size());
		
	}
	
	// the main is one thread and t is its child thread; method consume is part of the main thread and main will wait if 
	// list size ==0, the following shows a pattern of   start t thread --> main thread waits --> t thread adds to list
	// --> main thread stops waiting. Pay attention: the wait and notifyall is w.r.t.  myListOne ! 
	public static void main(String[] args) throws InterruptedException{
		Thread t = new Thread(new Runnable(){public void run(){ProCon myProConTwo = new ProCon();try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} myProConTwo.produce();}});
		t.start();
		ProCon myProCon = new ProCon();
	    System.out.println("current myListOne size:"+ myProCon.myListOne.size());
		myProCon.consume();
	
	}
	
}
