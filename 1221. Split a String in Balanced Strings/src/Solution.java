class Solution {
    public int balancedStringSplit(String s) {
        int left = 0;
        int right = 0;
        int counter = 0;

        for (char c : s.toCharArray()) {
            if (c == 'L') {
                left++;
            } else right++;

            if (left == right) {
                counter++;
                left = 0;
                right = 0;
            }
        }

        return counter;
    }
}