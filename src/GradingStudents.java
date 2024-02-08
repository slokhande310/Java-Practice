// https://www.hackerrank.com/contests/mountblue-technologies/challenges/grading/problem
import java.util.Arrays;

public class GradingStudents {
    static int[] gradingStudents(int[] marks) {
        int len = marks.length;
        // array to store result
        int[] result = new int[len];
        for (int i = 0; i < marks.length; i++) {
            // marks < 38 ? fail no change
            if (marks[i] < 38) {
                result[i] = marks[i];
            } else {
                // find the modulus of marks, suppose marks are 68, 68 % 5 = 3
                int difference = marks[i] % 5;
                // if diff > 2, bcz next multiple of 5 after 68 is 70. so it is closer to 70 by 2 i.e. 69, 70 
                if (marks[i] >= 38 && difference > 2)
                    result[i] = marks[i] + (5 - difference);    // we calculate diff and then add 5 - diff, to next multiple of 5
                else
                    result[i] = marks[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] marks = {73, 67, 38, 33};
        System.out.println(Arrays.toString(gradingStudents(marks)));
    }
}
