package javaRevision;

public class FindthereverseStringwithoutUsingStringfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Automation";
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		StringBuilder str3 = str2.reverse(); // used string builder to reverse
		//or str2 =  str2.reverse();
		System.out.println(str3);

	}

}

//Scanner in = new Scanner(System.in);
//System.out.println("Enter your String");
//str = in.nextLine();