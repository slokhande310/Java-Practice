// https://www.hackerrank.com/contests/mountblue-technologies/challenges/library-fine

public class LibraryFine {
    static int libraryFine(int dateReturned, int dateExpected, int monthReturned, int monthExpected, int yearReturned, int yearExpected) {

        int fine = 0;
        if (dateReturned <= dateExpected && monthReturned <= monthExpected && yearReturned <= yearExpected)
            return fine;
        else if (dateReturned > dateExpected && monthReturned == monthExpected && yearReturned == yearExpected) {
            fine = 15 * (dateReturned - dateExpected);
            return fine;
        } else if (monthReturned > monthExpected && yearReturned == yearExpected) {
            fine = 500 * (monthReturned - monthExpected);
            return fine;
        } else if (yearReturned > yearExpected) {
            return fine = 10000;
        }
        return fine;
    }

    public static void main(String[] args) {
        int dateReturned = 9, dateExpected = 6, monthReturned = 6, monthExpected = 6, yearReturned = 2015, yearExpected = 2015;
        int fine = libraryFine(dateReturned, dateExpected, monthReturned, monthExpected, yearReturned, yearExpected);
        System.out.println("Fine: " + fine);
    }
}
