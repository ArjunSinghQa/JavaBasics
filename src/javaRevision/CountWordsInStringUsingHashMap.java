package javaRevision;

import java.util.HashMap;

public class CountWordsInStringUsingHashMap {

	public static void main(String[] args) {
		
		  String str = "This This is is done by Saket Saket is Saket";
	      String[] split = str.split(" ");
	         
	      HashMap<String,Integer> map = new HashMap<String,Integer>();
		        for (int i=0; i<split.length; i++) {
		            if (map.containsKey(split[i])) {
		                int count = map.get(split[i]);
		                map.put(split[i], count+1); // returns the value already associated with key
		            }
		            else {
		                map.put(split[i], 1);
		            }
		        }
		        System.out.println(map);
//hello this code is good
	}

}
