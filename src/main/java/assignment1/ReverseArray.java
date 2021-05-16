package assignment1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {

	/*Write a program to reverse the elements of an array where the array size as well as the
	array values are entered by the user.*/
	public static void main(String[] args) {
		int arraySize = 0;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		arraySize = reader.nextInt();
		Integer[] arrayElements = new Integer[arraySize];
		reader.close();
		
		for(int i = 0; i < arraySize; i++) {
			System.out.println("Enter " +arraySize+ " elements of the array: ");
			arrayElements[i] = reader.nextInt();
		}
		System.out.println("Unordered array: " + Arrays.toString(arrayElements));
		
		Arrays.sort(arrayElements, Collections.reverseOrder());
		System.out.println("Reversed array: " + Arrays.toString(arrayElements));
	}

}
