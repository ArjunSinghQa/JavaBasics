package javaRevision;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("1");
			System.out.println(1/0);
		}
		catch(ArithmeticException e) {
			System.out.println("2");
		}catch(Exception e) {
			System.out.println("3");
			
		}

	}

}
//exception should be in increasing order
//most specific one should be first , then the generic ones 
//if we write exception e first in above code then it throws compile time error
