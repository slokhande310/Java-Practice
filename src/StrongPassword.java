// https://www.hackerrank.com/contests/mountblue-technologies/challenges/strong-password
import java.util.regex.Pattern;

public class StrongPassword {
    static int minimumNumber(String password, int n) {
        int missingComponents = 0;

        // Check for at least one digit
        if (!Pattern.compile(".*[0-9].*").matcher(password).find()) {
            missingComponents++;
        }
        if (!Pattern.compile(".*[a-z].*").matcher(password).find()) {
            missingComponents++;
        }
        if (!Pattern.compile(".*[A-Z].*").matcher(password).find()) {
            missingComponents++;
        }
        if (!Pattern.compile(".*[!@#$%^&*()-+].*").matcher(password).find()) {
            missingComponents++;
        }
        if (password.length() < 6) {
            return 6 - n;
        }

        return missingComponents;
    }

    public static void main(String[] args) {
        String password = "Ab1";
        int missing = minimumNumber(password, password.length());
        System.out.println(missing);
    }
}
