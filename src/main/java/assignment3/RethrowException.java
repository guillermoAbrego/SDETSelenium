package assignment3;

public class RethrowException {

	public static void main(String[] args) {
		int num1 = 20, num2 = 0, num3;
        try {
            num3 = num1/num2; //20/2
            System.out.println("Result of division is: " + num3);
        }
        catch(ArithmeticException ae) {
        	throw new ArithmeticException("Number can't be divided by zero");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
	}

}
