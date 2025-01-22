package javaRevision;

public class OctalLogicinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {120,200,016};
		for(int i = 0; i<x.length;i++)
		{
			System.out.println(x[i]+"");
		}

	}

}
// adding 0 before a number turns it into octal, then conversing it into decimal makes it 14 as 0*8^2 + 1*8^1 + 6*8^0 = 14