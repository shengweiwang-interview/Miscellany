package jc;

public class NewThreadOneDriver {
	
	public static void main(String[] args) throws InterruptedException{
		Thread myThread = new NewThreadOne();
		myThread.start();
		myThread.join();
		//Thread.sleep(1);
		System.out.println("This is from the Main thread");
		
	}

}
