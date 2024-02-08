public class MiniMaxSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        long totalSum = 0;
        long minElement = Long.MAX_VALUE;   // assign minElement as largest number of Long
        long maxElement = Long.MIN_VALUE;   // assign maxElement as smallest number of Long

        for (int j : arr) {
            totalSum += j;                          //  add all numbers in array
            minElement = Math.min(minElement, j);   //  find min element in array
            maxElement = Math.max(maxElement, j);   //  find max element in array
        }

        long minSum = totalSum - maxElement;        // subtract max from total to get minSum
        long maxSum = totalSum - minElement;        // subtract min from total to get maxSum

        System.out.println(minSum + " " + maxSum);
    }
}
