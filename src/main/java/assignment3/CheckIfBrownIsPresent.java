package assignment3;

import java.util.Scanner;

public class CheckIfBrownIsPresent {

	public static void main(String[] args) {
		String myString;
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		
		myString = reader.nextLine();
		reader.close();
		
		String convertedString = myString.toLowerCase();
		
		if(checkTextIsPresent(convertedString)) {
			System.out.println("String: '" + myString +"' contains the word 'brown'");
		} else {
			System.out.println("String: '" + myString + "' does NOT contain the word 'brown'");
		}

	}
	
	static boolean checkTextIsPresent(String myText) {
		if(myText.contains("brown")) {
			return true;
		} else {
			return false;
		}
	}

}
