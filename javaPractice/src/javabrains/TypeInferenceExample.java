package javabrains;

public class TypeInferenceExample {

	public static void main(String[] args) {
		
		StringLengthlambda myLambda=(s) -> s.length();
		System.out.println(myLambda.getLength("Hello Lambda"));
		

	}
	
	
	interface StringLengthlambda{
		int getLength(String s);
	}
	

}
