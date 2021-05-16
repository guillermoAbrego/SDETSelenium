package assignment2;

public class DuplicateInArray {

	public static void main(String[] args) {
		Integer[] numbers = {12, 32, 12, 45, 65, 93, 0, 23, 45, 6};
		
		for (int i = 0; i < numbers.length; i++) { 
			for (int j = i + 1 ; j < numbers.length; j++) { 
				if (numbers[i].equals(numbers[j])) {
				
					System.out.println("Duplicated element: " + numbers[j]); 
				} 
			} 
		}

	}

}
