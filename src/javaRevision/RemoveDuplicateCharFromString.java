package javaRevision;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharFromString {
	
	private static String duplicatestring(String abc) {
		
		    // TODO Auto-generated method stub
		    String lowercaseString = abc.toLowerCase();
		    char[] characters = lowercaseString.toCharArray();
		    LinkedHashSet<Character> uniqueCharacters = new LinkedHashSet<>();
	        for (char character : characters) {
	            if (!uniqueCharacters.contains(character)) {
	                uniqueCharacters.add(character);
	            }
	        }
	        StringBuilder resultBuilder = new StringBuilder();
	        for (char character : uniqueCharacters) {
	            resultBuilder.append(character);
	        }
	        return resultBuilder.toString();
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String abc = "hackerearth";
		String resultstring = duplicatestring(abc);
		System.out.println(resultstring);
		}
	
	}


