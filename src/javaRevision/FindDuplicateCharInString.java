package javaRevision;

public class FindDuplicateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String abc = "hackerearth";
		char[] a = abc.toCharArray();
		int j = a.length;
		for(int i=0;i<j;i++)
		{
			for(int k=i+1;k<j;k++)
			{
				if( a[i]==a[k])
				{
				  System.out.print(a[i]+ " ");
				}
			}
		}
	 }
}
