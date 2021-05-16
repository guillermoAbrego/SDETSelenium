package assignment3;

import java.util.Scanner;

public class HandleNumberFormatException {

	public static void main(String[] args) {
		try {
			int myNumber = 0;
			Scanner reader = new Scanner(System.in);
			System.out.println("Please enter a number: ");
			
			myNumber = Integer.parseInt(reader.next());
			reader.close();
		} catch (NumberFormatException nfe) {
			System.out.println("This is not a number");
		}
	}

}
