package adt;

public class App {

	public static void main(String[] args) {
        Counter count=new Counter("My counter");
        count.increment();
        count.increment();

        count.increment();

        count.increment();

        System.out.println(count.getCurrentValue());
        
	}

}
