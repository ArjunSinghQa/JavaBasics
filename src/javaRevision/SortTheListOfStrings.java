package javaRevision;

import java.util.Arrays;

public class SortTheListOfStrings {
	
	public static void showList(String[] array) {
	    for (String str: array) {
	      System.out.print(str + " ");
	    }
	    System.out.println();
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] list = { "Jan", "Feb", "Mar", "Apr", "May", "Jun",
			      "Jul", "aug", "Sep", "Oct", "nov", "Dec"};
		
		Arrays.sort(list); //sorting on alphabetical order
		
		//System.out.println(list.toString());
		
		showList(list);
		
		
	}

}
