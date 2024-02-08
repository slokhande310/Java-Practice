import java.util.Scanner;

public class SeriesGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                int result = a;

                // Evaluate the expression a + 2^0 * b + 2^1 * b + ... + 2^(j-1) * b
                for (int k = 0; k <= j; k++) {
                    result += (int) (Math.pow(2, k) * b);
                }
                System.out.print(result + " ");
            }
            System.out.println(); // Move to the next line after printing the series
        }
        in.close();
    }
}
