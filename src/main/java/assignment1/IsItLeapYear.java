package assignment1;

import java.util.Scanner;

public class IsItLeapYear {

	public static void main(String[] args) {
		int year;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		year = reader.nextInt();
		reader.close();
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a leap year!");
				} else {
					System.out.println(year + " is not a leap year!");
				}
			} else {
				System.out.println(year + " is not a leap year!");
			}
		} else {
			System.out.println(year + " is not a leap year!");
		}
	}
}
