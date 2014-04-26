package jc;


// to print from child thread earlier, either use child.join()
// or make the parent thread (main()) to sleep for sometime
public class NewThreadOneDriver {
	
	public static void main(String[] args) throws InterruptedException{
		Thread myThread = new NewThreadOne();
		myThread.start();
		//myThread.join();
		Thread.sleep(1);     
		System.out.println("This is from the Main thread");
		
	}

}
