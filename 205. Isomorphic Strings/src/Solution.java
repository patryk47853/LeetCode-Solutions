class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> values = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char main = s.charAt(i);
            char replace = t.charAt(i);

            if (!values.containsKey(main)) {
                if (!values.containsValue(replace)) {
                    values.put(main, replace);
                } else {
                    return false;
                }
            } else {
                char character = values.get(main);
                if (character != replace) return false;
            }
        }

        return true;
    }
}