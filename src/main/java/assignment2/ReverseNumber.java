package assignment2;

public class ReverseNumber {

	public static void main(String[] args) {

        int num = 123;
        int reversed = 0;
        
        System.out.println("Original Number: " + num);

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        System.out.println("Reversed Number: " + reversed);
    }

}
