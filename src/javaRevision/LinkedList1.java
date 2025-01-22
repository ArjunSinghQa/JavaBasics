package javaRevision;


import java.util.*;

public class LinkedList1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list= new LinkedList<String>();
		list.add("vijay");
		list.add("vijay");
		list.add("ajay");
		list.add("sanjay");
		
		Iterator<String> i = list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		//loop to reverse the list using the linked list
	    Iterator<String> i1=list.descendingIterator();  
        while(i1.hasNext())  
        {  
            System.out.println(i1.next());  
        }  

		/*
		 * Java LinkedList class can contain duplicate elements. 
		 * Java LinkedList class maintains insertion order.
		 *  Java LinkedList class is non synchronized. 
		 *  In Java LinkedList class, manipulation is fast because no shifting needs to occur.
		 * Java LinkedList class can be used as a list, stack or queue. 
		 * In the case of a doubly linked list, we can add or remove elements from both sides.
		 */
	

}
}