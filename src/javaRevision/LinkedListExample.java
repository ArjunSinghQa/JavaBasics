package javaRevision;
import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating list of books
		List<Book> book = new LinkedList<Book>();
		
		//creating books
		Book b1= new Book(45,"arjusing","helloworld",700);
		Book b2= new Book(55,"snehaukey","helloworld",800);
		Book b3= new Book(65,"meeraarjunsingh","helloworld",900);
		
		//adding books to list
		book.add(b1);
		book.add(b2);
		book.add(b3);
		
		//TraversingList
		for(Book b:book) {
			System.out.println(b.authorname+" "+b.bookname+" "+b.noofpages+" "+b.price);
		}
		
		
	}

}
