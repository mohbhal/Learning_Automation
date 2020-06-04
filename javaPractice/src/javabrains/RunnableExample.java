package javabrains;

public class RunnableExample {

	public static void main(String[] args) {
		
		
		Thread myThread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(" printed inside runnable");
				
			}
		});
		
		myThread.run();
		
		Thread myLambdaThread=new Thread(() -> System.out.println("Printed "));
		myLambdaThread.run();
	}
	
	

}
