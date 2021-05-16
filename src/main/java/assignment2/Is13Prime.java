package assignment2;

public class Is13Prime {

	public static void main(String[] args) {
		//Will only accept numbers above 2
		int number = 2;
		if (isItPrime(number)) {
	        System.out.println("Number " + number + " is a prime number.");
	    } else {
	    	System.out.println("Number " + number + " is NOT a prime number.");
	    }
	}

	public static boolean isItPrime(int n) {
	         
	    // Base cases
	    for (int i = 2; i <= n; i++) {
	    	if (n % i == 0) {
		        return false;
		    } else {
		    	return true;
		    }
	    }
	    return isItPrime(n);
	}
}
