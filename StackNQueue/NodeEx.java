package StackNQueue;

public class NodeEx {
	private Node header;
	private int size;
	private Node tail;
	
	public NodeEx() {
		header = new Node(null);
		size = 0;
	}
	
	
	private class Node{
		private Object data;
		private Node nextNode;
		
		public Node(Object obj) {
			this.data =obj;
			this.nextNode = null;
		}
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.nextNode = header;
		header = newNode;
		size++;
		
		if(header.nextNode == null) {
			tail = header;
		}
		
	}
	
	
	public void addLast(Object input) {
		Node newNode = new Node(input);
		if(size == 0 ) {
			addFirst(input);
		}else {
			Node x = header;
			for(int i=0; i<size-1; i++) {
				x = x.nextNode;
			}
			x.nextNode = newNode; 
			size++;
		}
	}
	
	
	public Node node(int index) {
		Node x = header;
		for(int i = 0; i<index; i++) {
			x = x.nextNode;
		}
		return x;
	}
	
	public void remove(int index) {
		Node x = header;
		Node y;
		for(int i=0; i<index-1; i++) {
			x = x.nextNode;
		}
		y = x.nextNode.nextNode;
		x.nextNode = y;
		size --;
	}
}
