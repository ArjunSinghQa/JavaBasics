package javaRevision;

public class FindTheWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "How are you";
		String[] d = word.split("[ ]");
		String cs = "are";
		for (String a : d) 
		{
			if (a.equalsIgnoreCase(cs))
			{
				System.out.println(cs);
			}
		}
		
	}
}