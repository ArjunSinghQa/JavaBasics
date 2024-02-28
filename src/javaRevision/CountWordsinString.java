package javaRevision;

import java.util.HashSet;
import java.util.Set;

public class CountWordsinString {

	public static void main(String[] args) {
		String[] name = {"My", "name", "is", "arjun", "My","arjun", "bangari", "singh", "arjun","singh","My"};
		int num = name.length;
		Set<String> nameduplicate = new HashSet<String>();
		/*
		 * for(int i=0;i<num;i++) { if( i == num-1 &&
		 * nameduplicate.contains(name[num-1])) break; int m = 0;
		 * if(nameduplicate.contains(name[i])) { i++;
		 * if(nameduplicate.contains(name[i])) { i++; } } int k = 1; for(int
		 * s=i+1;s<num;s++) { if(name[i].equalsIgnoreCase(name[s])) { k++;
		 * nameduplicate.add(name[i]); } else { m = 1; }
		 * 
		 * } if(k>1) { System.out.println("The value of " + name[i] + " is : " + k); }
		 * else { if(m == 0) break; System.out.println("The value of " + name[i] +
		 * " is : " + m); } }
		 */
		
		for(int i=0;i<num;i++) {
			int count=0; 
			int k=0;
		if(nameduplicate.contains(name[i]))
		{
			count++;
			k++;
			if(count>1)
			{
				
				
			}
		
		}
		else 
		{
			count = 1;
			nameduplicate.add(name[i]);
		}
   }
}}