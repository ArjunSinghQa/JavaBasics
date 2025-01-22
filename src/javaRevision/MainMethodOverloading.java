package javaRevision;

public class MainMethodOverloading {

	
	
		public static void main(String[] args) {
			System.out.println("main method with string args");
			main(5);
		}

	
		public static void main() {
			System.out.println("main without arguments");
			
		}
		
		public static void main(int x) {
			System.out.println("main with int arguments" + "" +x);
			main();
			
		}
	

}
//on running code jvm will search for matching main method , and will print the output
//