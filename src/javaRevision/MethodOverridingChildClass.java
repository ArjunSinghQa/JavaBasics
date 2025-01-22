package javaRevision;

public class MethodOverridingChildClass extends MethodOverriding {
	
	public void display() {
		
		System.out.println("child class");
	}

	public static void main(String[] args) {
	
		MethodOverriding or = new MethodOverridingChildClass(); //runtime polymorphism, dynamic method dispatch 
		or.display();
		MethodOverriding or1 = new MethodOverriding();
		or1.display();
		MethodOverridingChildClass or2 = new MethodOverridingChildClass();
		or2.display();
		
	}
//method overriding is a procedure in which the compiler can allow a child class to implement a specific method
	// already present in parent class
}
