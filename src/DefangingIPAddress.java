// https://leetcode.com/problems/defanging-an-ip-address

public class DefangingIPAddress {

    static String defangIPaddr(String address) {
        StringBuilder newAddress = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                newAddress.append("[.]");
            } else {
                newAddress.append(address.charAt(i));
            }
        }
        return newAddress.toString();
    }

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
}