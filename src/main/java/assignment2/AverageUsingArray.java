package assignment2;

public class AverageUsingArray {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		int sum = 0;
		int average = 0;

		for(int number : numbers) {
			sum = sum + number;
		}
		average = sum / numbers.length;
		System.out.println("Average of numbers is: " + average);
	}
	
	

}
