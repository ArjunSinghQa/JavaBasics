package javaRevision;

public class ReverseString {

	public static void main(String[] args) {
		
		String a = "Hello Arjun Singh";
		char chars[] = a.toCharArray();  
		int b = chars.length;
		for(int i=b-1;i>=0;i--)
		{
			System.out.print( chars[i]);
		}

	}

}
