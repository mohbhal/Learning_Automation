package polyexamples;

public class GrandChild extends Parent {
	
	public void show() {

		System.out.println(" GrandChild  Class method override from Child");
	}
	public void showChildMethod() {

		System.out.println(" Child Class overridden method");
	}
	public void showGrandChildMethod() {

		System.out.println(" GrandChild Class personal method");
	}

	public static void main(String[] args) {
		
		Parent c1=new GrandChild();
		c1.show();
		c1.showParentMethod();
		
		

	}

}
