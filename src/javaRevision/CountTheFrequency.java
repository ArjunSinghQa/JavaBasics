package javaRevision;

public class CountTheFrequency {

	public static void main(String[] args) {
		
		int a[] = {1,2,2,3,4,4,4,4,8,9,1};
		
		int b[];
		
	
		for(int i = 0; i<a.length;i++)
		{
			int visited = 0;
			int count=1;
			for(int j = i+1;j<a.length;j++) {
			
				if(a[i]==a[j]) {
					count++;
					visited++;
				}
				else {
					count =1;
			}
				
			}
			
			
			System.out.println("the count of " + a[i]+ "is" + count);
		}
		
		}
	
	}

