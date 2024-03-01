package javaRevision;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throw new NullPointerException("Arjun");
			
		}catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
        }catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
	  finally
	    {
		System.out.println("Singh Bangari");
		System.out.println("Singh Bangari");
		
		
	    }

}}
// duplicate catch block not allowed
//finally block will get executed always
// if we change the order of the exception , then the error will come,
//as it gets caught by the respective exception class
// we always need to write exception in the increasing order 
//if we write only exception then it wont throw an error
// but if we write exception first and then concerned exception later, then order gets disturbed 
//compile time error will be there
