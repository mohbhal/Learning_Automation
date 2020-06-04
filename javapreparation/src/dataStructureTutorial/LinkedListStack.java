package dataStructureTutorial;

public class LinkedListStack 
{
	Node head;
	class Node
	{
		int value;
		Node next;
		
	}
	public LinkedListStack() 
	{
		head=null;
		
	}
	public void push(int value) 
	{
		Node extraNode=head;
		head=new Node();
		head.value=value;
		head.next=extraNode;
		
	}
	public int pop()
	{
		if(head==null)
		{
			System.out.println("Stack is empty");
		}
		int value=head.value;
		head=head.next;
		return value;
	}
	public static void main(String[] args) {
		LinkedListStack ls=new LinkedListStack();
		//System.out.println(ls.pop());
		ls.push(10);
		ls.push(20);
		ls.push(30);
		ls.push(40);
		ls.push(50);
		System.out.println(ls.pop());
		System.out.println(ls.pop());
	}

}
