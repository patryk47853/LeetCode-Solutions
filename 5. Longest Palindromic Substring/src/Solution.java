public class Solution {

    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;

        String longest = "";

        for (int i = 1; i < s.length(); i++) {

            int left = i;
            int right = i;

            // Try extending in both directions till the conditions are met
            while (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;

                // In case we reach end/start of string
                if (left == -1 || right == s.length()) break;
            }

            String palindrome = s.substring(left + 1, right);
            if (palindrome.length() > longest.length()) {
                longest = palindrome;
            }

            // Even length case:
            left = i - 1;
            right = i;
            while (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;

                if (left == -1 || right == s.length()) break;
            }

            palindrome = s.substring(left + 1, right);
            if (palindrome.length() > longest.length()) {
                longest = palindrome;
            }
        }

        return longest;
    }
}
