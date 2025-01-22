package javaRevision;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListElementRemovalException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3);
		Iterator<Integer> itr = numbers.iterator();
		while(itr.hasNext())
		{
			int number = itr.next();
			numbers.remove(number);
		}

		
		System.out.println(numbers);
	}

}
//concurrent modification exception while removal of elements during iterations