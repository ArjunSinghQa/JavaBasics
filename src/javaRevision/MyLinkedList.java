package javaRevision;

public class MyLinkedList {
	
	class node{
		
		int data;
		node next;

		public node(int data) {
			this.data=data;
			next=null;
			
		}
		
	}


	 node head;
	 
	 public void printmylinkedlist()
	 {
		 node n=head;
		 while(n!=null)
		 {
			 System.out.println(n.data);
			 n=n.next;
		 }
		 
	 }
	

	public static void main(String[] args) {
		
		MyLinkedList ll = new MyLinkedList();
		node first = ll.new node(10);
		ll.head=first;
		
		
		node second = ll.new node(20);
		first.next=second;
		
		
		node third = ll.new node(30);
		second.next=third;
		
		ll.printmylinkedlist();
		
		

	}

}
