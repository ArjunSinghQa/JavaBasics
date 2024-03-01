package javaRevision;

public class FindTheWordWithoutSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Arjun Singh Bangari";
		char[] b = a.toCharArray();
		int c = b.length;
		for(int i=0;i<=c-1;i++)
		{
			if(i>5 && i<11)
			{
				System.out.print(b[i]);
				System.out.println("hiiiiiiii");
				System.out.println("hiiiiiiii2");
				
			}
		}
		
		
	}

}
