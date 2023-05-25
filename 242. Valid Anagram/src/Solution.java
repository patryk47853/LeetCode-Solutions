import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // Output: true
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> theMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (theMap.containsKey(s.charAt(i))) {
                Integer value = theMap.get(s.charAt(i));
                value++;
                theMap.put(s.charAt(i), value);
            } else {
                theMap.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (theMap.containsKey(t.charAt(i))) {
                Integer value = theMap.get(t.charAt(i));
                value--;
                theMap.put(t.charAt(i), value);
            }
        }

        for (int count : theMap.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}