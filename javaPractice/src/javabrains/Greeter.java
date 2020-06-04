package javabrains;

public class Greeter {
	public void greet(Greeting greeting) {
		
		greeting.perform();
	}

	
	public static void main(String[] args) {
		Greeter greeter=new Greeter();
		
		HelloWorldGreeting helloWorldGreeting=new HelloWorldGreeting();
		Greeting mylambdaExpression=() -> System.out.println("Hello World");
		
		//1. call perform function by helloWorldGreeting
		helloWorldGreeting.perform();
		
		
		//2. call perform function by mylambdaExpression
		mylambdaExpression.perform();
		
		//  lambda is not same as inner type...Some video tells that these are same
		
		Greeting innerClassGreeting= new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("Hello World");
				
			}
		};
		innerClassGreeting.perform();
		 
		
	}

	
}
