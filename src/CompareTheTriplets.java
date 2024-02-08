import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/contests/mountblue-technologies/challenges/compare-the-triplets/problem
public class CompareTheTriplets {
    static int[] compareTriplets(int[] alice, int[] bob) {
        int[] result = new int[2];
        int aliceCount = 0;
        int bobCount = 0;
        for (int i = 0; i < alice.length; i++) {
            if (alice[i] > bob[i])
                aliceCount++;
            else if (bob[i] > alice[i])
                bobCount++;
        }
        result[0] = aliceCount;
        result[1] = bobCount;
        return result;
    }

    public static void main(String[] args) {
        int[] alice = {17, 28, 30};
        int[] bob = {99, 16, 8};
        int[] result = compareTriplets(alice, bob);
        System.out.println(Arrays.toString(result));
    }
}
