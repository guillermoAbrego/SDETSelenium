package assignment3;

import java.util.Scanner;

public class PrintEachOcurrence {

	public static void main(String[] args) {
		String myString = "";
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		
		myString = reader.next();
		reader.close();
		
		for(int i = 0; i < myString.length(); i++) {
			System.out.println(myString.charAt(i));
		}
	}
}
