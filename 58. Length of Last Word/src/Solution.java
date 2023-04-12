public class Solution {

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("Hello World")); // should return 5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  ")); // should return 4
        System.out.println(lengthOfLastWord("luffy is still joyboy")); // should return 6
    }

    public static int lengthOfLastWord(String s) {

        int length = 0;

        for(int i = s.length() - 1; i>=0; i--) {
           if (s.charAt(i) != ' ') {
               length++;
           } else if(length > 0) {
               return length;
           }
        }

        return length;
    }
}