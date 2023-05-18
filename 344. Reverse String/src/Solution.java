public class Solution {
    public static void main(String[] args) {
        char[] testCase = {'h','e','l','l','o'};
        reverseString(testCase);
        System.out.println(testCase);
    }

    // temp

    public static void reverseString(char[] s) {
        int size = s.length;
        for (int i = 0, j = size - 1; i < size / 2; i++) {
            swap(s, i, j--);
        }
    }

    public static void swap(char[] s, int i, int j) {
        char c = s[i];
        s[i] = s[j];
        s[j] = c;
    }
}