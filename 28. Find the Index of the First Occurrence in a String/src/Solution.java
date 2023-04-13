public class Solution {

    public static void main(String[] args) {

        System.out.println(strStr("sadbutsad", "sad")); // should return 0
        System.out.println(strStr("leetcode", "leeto")); // should return -1
    }

    public static int strStr(String haystack, String needle) {

        for (int i=0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, needle.length() + i).equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }
}