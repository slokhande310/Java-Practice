// https://www.hackerrank.com/contests/mountblue-technologies/challenges/sock-merchant

public class SalesByMatch {

    static int sockMerchant(int n, int[] ar) {

        int pair = 0;
        int[] occurrences = new int[101];
        for (int j : ar) {
            occurrences[j]++;
            if (occurrences[j] % 2 == 0)
                pair += 1;
        }
        return pair;
    }

    public static void main(String[] args) {
        int n = 7;
//        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int[] ar = {1, 2, 1, 2, 1, 3, 2};
        System.out.println(sockMerchant(n, ar));
    }
}
