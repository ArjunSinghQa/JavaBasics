package javaRevision;

public class FindTheSecondLargestInanArray {

	public static void main(String[] args) {
	
		int a[] = {1,100,56,89,34,52,49,82};
		int b = a.length;
		int secondlargest = 0;
		int largest = 0;
		System.out.println("The given array is :");
		for(int i=0;i<b;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for(int i=0;i<b;i++) 
		{
			if(a[i]> largest) {
				largest=a[i];
			}
			
			else if (a[i] > secondlargest)
            {
                secondlargest = a[i];
            }
		}
		
		System.out.println("The largest number is : " + largest);
		System.out.println("The second largest number is : " + secondlargest);
		
	}

}
