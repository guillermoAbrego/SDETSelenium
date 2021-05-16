package assignment3;

import java.util.Scanner;

public class CheckIfPalindrome {

	public static void main(String[] args) {
		String myString = "";
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		
		myString = reader.next();
		reader.close();
		
		String convertedString = myString.toLowerCase();
		
		if(isPalindrome(convertedString)) {
			System.out.println(myString + " is a palindrome");
		} else {
			System.out.println(myString + " is NOT a palindrome");
		}

	}
	
	static boolean isPalindrome(String myString) {
		int i = 0, j = myString.length() - 1;
		
		while(i < j) {
			if(myString.charAt(i) != myString.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
