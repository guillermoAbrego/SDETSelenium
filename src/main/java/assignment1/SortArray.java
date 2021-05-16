package assignment1;

import java.util.Arrays;

public class SortArray {

	//Write a program to sort the elements of an array in ascending order. 
	public static void main(String[] args) {
		int[] numArray = {5,1,40,31,20,0};
		System.out.println("Unordered array: " + Arrays.toString(numArray));
		
		Arrays.sort(numArray);
		System.out.println("Ordered array: " + Arrays.toString(numArray));
	}

}
