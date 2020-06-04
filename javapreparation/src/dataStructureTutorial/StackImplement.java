package dataStructureTutorial;

public class StackImplement {
	
	//declare array size
	
	int size;
	int arr[];
	int top;
	public StackImplement(int size) {
		this.size=size;
		this.arr=new int[size];
		this.top=-1;
		
	}
	//Time complexity O(1)
	public void push(int element) {
		if(!isFull()) {
			top++;
			arr[top]=element;
			System.out.println("Pushed element" + element);
		}
		else {
			System.out.println("Stack is full");
		}
	}
	public int pop() {
		if(!isEmpty()) {
			int returned=top;
			top--;
			System.out.println("Pop the element " + arr[returned]);
			return arr[returned];
		}
		else {
			System.out.println("Stack is Empty");
			return -1;
		}
		
	}
	public int peek() {
		if(!this.isEmpty()) {
			return arr[top];
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public boolean isFull() {
		return (size-1==top);
	}
	

	public static void main(String[] args) {
		StackImplement stack=new StackImplement(10);
		stack.pop();
		System.out.println("****************");
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.pop();
		stack.pop();
		stack.peek();

	}

}
