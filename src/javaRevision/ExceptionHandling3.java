package javaRevision;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("1");
			throw new NullPointerException();
		}catch(Exception e){
			System.out.println("2");
			return;
		}finally {
			System.out.println("3");
		}
	}

}
