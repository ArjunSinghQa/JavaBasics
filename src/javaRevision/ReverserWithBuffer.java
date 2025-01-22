package javaRevision;

public class ReverserWithBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "abc";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(s); //will show original string AS STRING ARE IMMUTABLE
		System.out.println(sb); //will show reversed string

	}

}
