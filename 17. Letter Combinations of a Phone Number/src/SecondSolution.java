class SecondSolution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) return new ArrayList<>();

        String[] charMap = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        backtrack(res, digits.toCharArray(), "", charMap);

        return res;
    }

    public void backtrack(List<String> res, char[] digits, String s, String[] charMap) {
        if (s.length() == digits.length) {
            res.add(s);
            return;
        }
        int i = s.length();
        int digit = digits[i] - '0';
        for (char letter : charMap[digit].toCharArray()) {
            backtrack(res, digits, s + Character.toString(letter), charMap);
        }
    }
}