package javaRevision;

public class StringConcatenation {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a+b + " is the sum of a+b");
		System.out.println("the sum is " + a+b);

	}

}
// as java executes from left to right , the sum is getting executed in first sysout statement
//whereas in second statement , its just concatenating the variables

//The + operator behaves differently for Strings and numbers. When invoked on a String, it concatenates. 
//When invoked on a numeric type, it adds. By starting with "",
//you are telling the compiler to concatenate a number to the string, which in turn converts the number to a String. 
//This is repeated for all further concatenations.