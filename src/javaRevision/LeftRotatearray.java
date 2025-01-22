package javaRevision;

public class LeftRotatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,6};
		
		int c1 = 3;
		
		System.out.println("original array is");
		
		for (int i=0;i<a.length;i++) {
			
			System.out.print(a[i] + " ");
		}

		
		for ( c1=0;c1<3;c1++) {
			int j , first ;
			
			first = a[0];
			for( j = 0;j<a.length-1;j++)
			{
				a[j]= a[j+1];
			}
			a[j]=first ;
			
		}
		System.out.println();
		System.out.println("array after rotation");
		
		for(int i =0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	}

}
