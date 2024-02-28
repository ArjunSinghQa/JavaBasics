package javaRevision;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		
		//form a list of number from 0-9
		
		for(int i=0;i<10;i++) {
			list.add(String.valueOf(i));
		}
		
		//insert a new list of number from 0-5
		
		for(int i=0;i<5;i++) {
			list.add(String.valueOf(i));
		}
		
		System.out.println("Input list : " + list);
		
		System.out.println("\nFiltered Duplicates : " + processList(list));
	}
		public static Set<String> processList(List<String> listContainingDuplicates)
		{
			final Set<String> resultSet = new HashSet<String>();
			final Set<String> tempSet = new HashSet<String>();
			
			for(String yourint :listContainingDuplicates )
			{
				if(!tempSet.add(yourint))
				{
					resultSet.add(yourint);
					
				}
			}
			
			return resultSet;
		}

	}
