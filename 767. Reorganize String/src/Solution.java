class Solution {
    public String reorganizeString(String s) {
        // Initialize an array to store the frequency of each character in the string.
        int[] hash = new int[26];

        // Count the frequency of each character in the input string.
        for(int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        // Initialize variables to keep track of the most frequent character and its frequency.
        int max = 0;
        int letter = 0;

        // Find the most frequent character and its frequency.
        for(int i = 0; i < hash.length; i++) {
            if(hash[i] > max) {
                max = hash[i];
                letter = i;
            }
        }

        // Check if the most frequent character occurs more than half of the string length.
        if(max > (s.length() + 1) / 2) return "";

        // Initialize a character array to store the reorganized string.
        char[] ans = new char[s.length()];

        // Initialize an index to keep track of the position in the ans array.
        int index = 0;

        // Place the most frequent character in even indices of the ans array.
        while(hash[letter]-- > 0) {
            ans[index] = (char) (letter + 'a');
            index += 2;
        }

        // Fill the remaining characters in odd indices of the ans array.
        for(int i = 0; i < hash.length; i++) {
            while (hash[i]-- > 0) {
                if(index >= ans.length) index = 1;
                ans[index] = (char) (i + 'a');
                index += 2;
            }
        }

        // Convert the character array to a string and return it.
        return String.valueOf(ans);
    }
}