package polyexamples;

public class C extends B{
	
	public C() {
		
		System.out.println("C");
	}
	public C(int x) {
		super(100);
		System.out.println(x);
	}

	public static void main(String[] args) {
		new C(10);
		//new C();
		
		

	}

}
