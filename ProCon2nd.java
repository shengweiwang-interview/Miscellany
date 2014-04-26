package jc;

import java.util.*;

public class ProCon2nd {


		// what about there are two things to be synchronized?
		static List<String> myListOne = new ArrayList<String>(); // a class object to store the strings
		static List<String> myListTwo = new ArrayList<String>();
		static Object myLock = new Object();// this is the thing getting synchronized
		                                    // it is static as it is the same for all instances
		
		
		public void produce(){
			
			synchronized(myLock){
				myListOne.add("firstNameOne");
				myListTwo.add("lastNameOne");
				myLock.notifyAll(); // notice all waiting threads to stop waiting
				System.out.println("Adding finished and the current myListOne.size():  " + myListOne.size());
				
			}
		}
		
		public void consume() throws InterruptedException{
			
			synchronized(myLock){
			while( myListOne.size() == 0 || myListTwo.size() == 0){
				System.out.println("start waiting and the size :" + myListOne.size());
				myLock.wait();
			}
			// while waiting if gets notice from produce method then stops waiting and continue execute following codes
			myListOne.remove(0);
			myListTwo.remove(0);
			}
			System.out.println("Removing finished and the size is " + myListOne.size());
			
		}
		
		// the main is one thread and t is its child thread; method consume is part of the main thread and main will wait if 
		// list size ==0, the following shows a pattern of   start t thread --> main thread waits --> t thread adds to list
		// --> main thread stops waiting. Pay attention: the wait and notifyall is w.r.t.  myListOne ! 
		public static void main(String[] args) throws InterruptedException{
			Thread t = new Thread(new Runnable(){public void run(){ProCon2nd myProCon2ndTwo = new ProCon2nd();try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} myProCon2ndTwo.produce();}});
			t.start();
			ProCon2nd myProCon = new ProCon2nd();
		    System.out.println(myProCon.myListOne.size());
			myProCon.consume();
			
		
		   
	        
	        

			
		
			
			
		}
		
		
		

	

	
	
}
