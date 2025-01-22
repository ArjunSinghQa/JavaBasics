package javaRevision;

public class ByteRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x = 127;
		x++;
		x++;
		System.out.println(x);
	}
//when you increment the value , it will increment to its minimum value of -128  ,
	//and thus incrementing it again will make it -127
}
