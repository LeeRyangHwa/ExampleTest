package StackNQueue;

public class ArrayStack {
	private int top;
	private int maxSize;
	private Object[] stackArray;
	
	public ArrayStack(int maxSize) {
		this.maxSize = maxSize;
		this.top = -1;
		this.stackArray = new Object[maxSize];
	}
	
	public boolean empty(){
		if(top == -1) {
			System.out.println("Empty!!");

			return true;
		}else {
			return false;
		}
	}
	
	public boolean full() {
		if(top == maxSize-1) {
			System.out.println("Full!!");
			return true;
		}else {
			return false;
		}
	}
	
	public void push(Object item) {
		if(!full()) {
			stackArray[++top] = item;
			System.out.println("PUSH");
		}
	}
	
	public Object pop() {
		if(empty()) {
			return -1;
		}else {
			Object pop = stackArray[top];
			top--;
			System.out.println("POP");
			return pop;
		}
	}
	
	
}
