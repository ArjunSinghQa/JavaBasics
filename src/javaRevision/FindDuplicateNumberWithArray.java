package javaRevision;

public class FindDuplicateNumberWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5};
		
		System.out.println("Duplicate elements in given array: ");  
		
		  for(int i = 0; i < A.length; i++) {  
	            for(int j = i + 1; j < A.length; j++) {  
	                if(A[i] == A[j])  
	                    System.out.println(A[j]);  
	            }  
			 
			 
		 }
		

	}


	}
