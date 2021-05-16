package assignment1;

public class PrintEvenNumbers {

	//Write a program to print only even numbers till 50. 
	public static void main(String[] args) {
		isItEvenNumber();
	}
	
	static void isItEvenNumber() {
		int counter = 1, i = 1;
		
		while(counter <= 50) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			counter++;
			i++;
		}
	}
}
