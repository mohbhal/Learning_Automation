package java8;

public class LambdaExpression {
	
	public static void main(String[] args) {
		Add add=(a,b)->(a+b);
		System.out.println(add.addFunction(30, 40));

	}
	
}
interface Add{
	
	int addFunction(int a,int b);
	}

