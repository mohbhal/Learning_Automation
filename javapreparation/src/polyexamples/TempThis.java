package polyexamples;

public class TempThis {
	int x;
	int y;

	public TempThis(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void show() {
		System.out.println(x);
		System.out.println(y);
	}
	public TempThis(TempThis z) {
		this.x = z.x;
		this.y = z.y;
	}

	public static void main(String[] args) {

		TempThis t1 = new TempThis(10,20);
		t1.show();
		TempThis t2=new TempThis(t1);
		t2.show();
				
	}

}
