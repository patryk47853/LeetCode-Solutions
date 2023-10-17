import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maxVowels(String s, int k) {
        int currentWindow = 0;
        int maxVowels = 0;

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for(int i = 0; i < k; i++) {
            if(vowels.contains(s.charAt(i))) currentWindow++;
        }

        maxVowels = currentWindow;

        for(int i = k; i < s.length(); i++) {
            if(vowels.contains(s.charAt(i))) currentWindow++;
            if(vowels.contains(s.charAt(i - k))) currentWindow--;

            maxVowels = Math.max(currentWindow, maxVowels);
        }

        return maxVowels;
    }
}
