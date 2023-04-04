public class Solution {
    public static void main(String[] args) {
        String[] myString = {"house", "housekeeper", "home"};
        String[] nextString = {"tiny", "timber", "titanic"};

        System.out.println(longestCommonPrefix(myString)); // should return 'ho'
        System.out.println(longestCommonPrefix(nextString)); // should return 'ti'
    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null) return "";

        String prefix = strs[0];

        for (int i=0; i<strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}