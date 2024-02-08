public class MarsExploration {
    public static void main(String[] args) {
        String s = "STSTOT";
        int count = 0;
        for (int i = 0; i < s.length(); i = i + 3) {
            if (s.charAt(i) != 'S')
                count += 1;
            if (s.charAt(i + 1) != 'S')
                count += 1;
            if (s.charAt(i + 2) != 'S')
                count += 1;
        }
        System.out.println(count);
    }
}
