package javaRevision;

public class ArraywithMethodInput {
	
	
	 static void mincal(int[] a2 ) {
		
		 int min = a2[0];
		 for(int i = 1; i<a2.length ;i++)
		 
		 if(min>a2[i]) 
			min = a2[i];
			System.out.println(min);
		
		
	
		 
	 }

	public static void main(String[] args) {
		
		int a[] = {1,3,4,6,8};
		mincal(a);
	}

}
