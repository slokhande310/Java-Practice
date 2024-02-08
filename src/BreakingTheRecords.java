// https://www.hackerrank.com/contests/mountblue-technologies/challenges/breaking-best-and-worst-records

public class BreakingTheRecords {
    public static void main(String[] args) {
//        int[] scores = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        int minScore = scores[0];
        int maxScore = scores[0];
        int lowestScoresCount = 0, highestScoresCount = 0;

        for (int i = 1; i < scores.length; i++) {
            int score = scores[i];

            if (score < minScore) {
                lowestScoresCount += 1;
                minScore = score;
            } else if (score > maxScore) {
                highestScoresCount += 1;
                maxScore = score;
            }
        }
        System.out.println(highestScoresCount + " " + lowestScoresCount);
    }
}
