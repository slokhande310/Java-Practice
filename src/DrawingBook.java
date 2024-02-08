//https://www.hackerrank.com/contests/mountblue-technologies/challenges/drawing-book
/*
 len of book = n
 page to open = p

*/
public class DrawingBook {
    static int pageCount(int n, int p) {
        // Calculate the minimum turns from the beginning and from the end
        int fromBeginning = p / 2;      // 5 / 2 = 2
        int fromEnd = (n / 2) - (p / 2);    // ( 10 / 2) - (5 / 2) = 3

        // Return the minimum of turns from the beginning and from the end
        return Math.min(fromBeginning, fromEnd);
    }

    public static void main(String[] args) {
        int n = 10;
        int p = 5;
        int result = pageCount(n, p);
        System.out.println(result);
    }
}

