// https://www.hackerrank.com/contests/mountblue-technologies/challenges/birthday-cake-candles

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        int[] candles = {1,1,1,4};
        int maxHeight = candles[0];
        int count = 0;
        for (int i = 1; i < candles.length; i++) {
            maxHeight = Math.max(maxHeight, candles[i]);
        }
        for (int candle : candles) {
            if (maxHeight == candle)
                count += 1;
        }
        System.out.println(count);
    }
}
