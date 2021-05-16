package assignment3;

import java.util.Scanner;

public class ThrowArithmeticException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = scanner.nextInt();
        scanner.close();
        try {
           int result=add(num1,num2);
           System.out.println("Result is : "+result);
        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Reaching here");
	}
	
	 static int add(int num1, int num2) { //return type is int
       if (num1 > 900) {
           // throw is followed by an instance
          throw new ArithmeticException("Num 1 is greater than 900 and hence Exception is thrown");
       }
       return num1+num2;
     }

}
