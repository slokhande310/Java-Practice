// https://www.hackerrank.com/contests/mountblue-technologies/challenges/divisible-sum-pairs
public class DivisibleSumPairs {
    public static void main(String[] args) {
        int[] ar = {1, 3, 2, 6, 1, 2};
        int k = 3;
        int n = 6;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i < j && (ar[i] + ar[j]) % k == 0) {
                    System.out.println("[" + i + ", " + j + "]");
                }
            }
        }
    }
}
