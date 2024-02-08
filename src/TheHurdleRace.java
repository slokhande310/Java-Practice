// https://www.hackerrank.com/contests/mountblue-technologies/challenges/the-hurdle-race
public class TheHurdleRace {
    static int hurdleRace(int[] height, int k) {
        int maxHeight = k;
        for (int i : height) {
            if (i > maxHeight) {
                maxHeight = i;
            }
        }
        return maxHeight - k;
    }

    public static void main(String[] args) {
        int[] height = {1, 6, 3, 5, 2};
        int k = 4;
        int doses = hurdleRace(height, k);
        System.out.println(doses);
    }
}
