import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // default fib values are 0, 1;
        int num1 = 0, num2 = 1, num3 = 0;
        System.out.print("Enter a number: ");
        int number = new Scanner(System.in).nextInt();
        // If number enter is 0 return 0
        if (number == 0) {
            System.out.println(num1);
        } else {
            System.out.print(num1 + " ");
            // start with i = 1 as first value is known.
            for (int i = 1; i < number; i++) {
                num3 = num1 + num2;
                num2 = num1;
                num1 = num3;
            System.out.print(num3 + " ");
            }
        }
    }
}