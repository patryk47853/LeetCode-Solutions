class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer, Character> mappings = new HashMap<>();
        int size = s.length();
        String ans = "";

        for(int i=0; i < size; i++) {
            mappings.put(indices[i], s.charAt(i));
        }

        for(int i=0; i < size; i++) {
            ans += mappings.get(i);
        }

        return ans;
    }
}