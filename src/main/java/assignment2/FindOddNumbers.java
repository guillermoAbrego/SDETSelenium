package assignment2;

import java.util.ArrayList;
import java.util.List;

public class FindOddNumbers {

	public static void main(String[] args) {
		List<Integer> oddNumbers = new ArrayList<>();
		
		for(int i = 79; i <= 187; i++) {
			if (i %2 != 0) {
				oddNumbers.add(i);
			}
		}
		
		System.out.println("Odd numbers from 79 to 187 are: ");
		for(int number : oddNumbers) {
			System.out.println(number);
		}
	}

}
