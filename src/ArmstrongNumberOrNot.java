import java.util.Scanner;

// An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself
//3**3 + 7**3 + 1**3 = 371
public class ArmstrongNumberOrNot {
    public static void main(String[] args) {
        int result = 0;
        System.out.print("Enter a number to check if Armstrong or not: ");
        int number = new Scanner(System.in).nextInt();

        // store number in temp variable to compare with result
        int temp = number;
        while (number > 0) {

            // Get a remainder and find a cube of it
            int remainder = number % 10;
            int cubeOfNumber = remainder * remainder * remainder;

            // Store into result to compare it with original number
            result = result + cubeOfNumber;
            number = number / 10;
        }
        // Compare original number with result to check if Armstrong or not
        if (temp == result) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
