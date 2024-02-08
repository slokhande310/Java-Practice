// https://www.hackerrank.com/contests/mountblue-technologies/challenges/electronics-shop
public class ElectronicsShop {
    static int getMoneySpent(int budget, int[] keyboards, int[] drives){
        int max = -1;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                if (keyboard + drive <= budget && keyboard + drive > max) {
                    max = keyboard + drive;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int budget = 60;
        int[] keyboards = {40, 50, 60};
        int[] drives = {5, 8, 12};

        int result = getMoneySpent(budget, keyboards, drives);
        System.out.println(result);
    }
}
