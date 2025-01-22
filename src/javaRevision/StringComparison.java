package javaRevision;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3.equals(str2));

	}

}
// == operator compares the reference location of the variable 
// equals compares the exact content of the variiable 

