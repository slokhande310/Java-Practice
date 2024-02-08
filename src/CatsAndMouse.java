// https://www.hackerrank.com/contests/mountblue-technologies/challenges/cats-and-a-mouse
public class CatsAndMouse {
    static String catAndMouse(int catA, int catB, int mouse) {
        if (catA == catB)
            return "Mouse C";
        int a = catA - mouse;
        int b = catB - mouse;
        a = Math.abs(a);
        b = Math.abs(b);
        if (a < b)
            return "Cat A";
        else if (b < a)
            return "Cat B";
        else
            return "Mouse C";

    }

    public static void main(String[] args) {
        int catA = 1;
        int catB = 3;
        int mouse = 2;
        String result = catAndMouse(catA, catB, mouse);
        System.out.println(result);
    }
}
