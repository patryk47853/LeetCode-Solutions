public class Solution {

    public static void main(String[] args) {

        System.out.println(isPalindrome(232)); // should return true
        System.out.println(isPalindrome(452)); // should return false
        System.out.println(isPalindrome(632)); // should return false
        System.out.println(isPalindrome(898)); // should return true
    }

    public static boolean isPalindrome(int x) {

        String reversed = "";
        String current = String.valueOf(x);

        for (int i = current.length() - 1; i >= 0; i--) {
            reversed += current.charAt(i);
        }

        return reversed.equals(current);
    }
}