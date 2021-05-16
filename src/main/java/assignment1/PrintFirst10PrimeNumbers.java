package assignment1;

public class PrintFirst10PrimeNumbers {
	
	static boolean isNumberPrime(int number) {
        boolean isItPrime = true;
         
        if(number <= 1) {
            isItPrime = false;
            return isItPrime;
        }
        else {
            for (int i = 2; i <= number / 2; i++) {
                if ((number % i) == 0){
                    isItPrime = false;
                    break;
                }
            }
            return isItPrime;
        }
    }

	public static void main(String[] args) {
	 
        int counter = 1;
        int startNum = 2; //we start with 2 since we know 1 is not a prime number
         
        System.out.println("Initial 10 Prime Numbers :");
         
        while (counter <= 10) {   
            if (isNumberPrime(startNum)) {
                System.out.println(startNum);
                counter++;
                startNum++;
            }
            else {
            	startNum++;
            }
        }
    }
}
