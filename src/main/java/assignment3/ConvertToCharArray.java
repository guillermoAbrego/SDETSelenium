package assignment3;

import java.util.Scanner;

public class ConvertToCharArray {

	public static void main(String[] args) {
		
		String myString = "";
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		
		myString = reader.next();
		reader.close();
		
		//Converting string to char array
		char[] myCharArray = myString.toCharArray();
		
		System.out.println("String '" + myString + "' converted to char array: ");
		for(char c : myCharArray) {
			System.out.println(c);
		}
		
		//Re-converting char array to string
		String stringAgain = new String(myCharArray);
		System.out.println("Char array re-converted to string: " + stringAgain);
	}

}
