import java.util.Scanner;

public class DayOfTheProgrammer {
    static String dayOfProgrammer(int year) {
        String stringYear = "";
        String date = "";
        if (year >= 1700 && year <= 1917) {
            if (year % 4 == 0) {
                stringYear = Integer.toString(year);
                date = "12.09.".concat(stringYear);
            } else {
                stringYear = Integer.toString(year);
                date = "13.09.".concat(stringYear);
            }
        } else {
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                stringYear = Integer.toString(year);
                date = "12.09.".concat(stringYear);
            } else {
                stringYear = Integer.toString(year);
                date = "13.09.".concat(stringYear);
            }
        }
        return date;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        String date = dayOfProgrammer(year);
        System.out.println(date);
    }
}
