class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList();
        if(digits.length() == 0) return res;
        res.add("");

        String[] charMap = new String[] {"0", "1", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for(int i = 0; i<digits.length(); i++) {
            int index = Character.getNumericValue(digits.charAt(i));
            while(res.peek().length() == i) {
                String permutation = res.remove();
                for(char c : charMap[index].toCharArray()) {
                    res.add(permutation + c);
                }
            }
        }

        return res;
    }
}