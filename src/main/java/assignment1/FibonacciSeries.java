package assignment1;

public class FibonacciSeries {

	public static void main(String[] args) {
		//Change value of iterator if more number in the series need to be printed 
		int num1 = 0, num2 = 1, num3 = 0, counter = 0, iterator = 10;

		while(counter < iterator) {
			System.out.println(num1);
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			counter++;
		}
	}
}
