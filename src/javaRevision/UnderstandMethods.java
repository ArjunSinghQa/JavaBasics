package javaRevision;

public class UnderstandMethods {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UnderstandMethods a = new UnderstandMethods();
		a.names();
		names2();	
		UnderstandMethods.names2();
		
		
		
		
		
	}
	
	
	public void names()
	{
		System.out.println("Arjun Singh");
<<<<<<< HEAD
		System.out.println("How am i");
=======
		System.out.println("Arjun Singh how are you");
>>>>>>> 43ee1eee746330020bb37bc78798b16ec4dca471
	}
	
	public static void names2()     //static methods can be called directly in the main method within the class.
	                                //as long as method become static it gets bound to the class level so we can call it directly.
	{
		System.out.println("Arjun Singh2");
	}

}
