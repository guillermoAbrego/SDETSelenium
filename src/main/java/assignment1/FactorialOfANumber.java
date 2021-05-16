package assignment1;

import java.util.Scanner;

public class FactorialOfANumber {

	// Write a program to calculate the factorial of a number using a while loop. 
	public static void main(String[] args) {
		int number = 0, i = 1, result = 1;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = reader.nextInt();
		
		while (i <= number) {
			result *= i;
			i++;
		}
		System.out.println("Factorial of " + number + " is: " + result);
	}

}
