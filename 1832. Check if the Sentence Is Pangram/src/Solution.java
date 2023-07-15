class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        char[] array = sentence.toCharArray();

        for(char c : array) {
            set.add(c);
        }

        return set.size() == 26;
    }
}