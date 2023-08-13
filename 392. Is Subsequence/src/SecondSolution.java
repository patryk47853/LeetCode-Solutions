class SecondSolution {
    public boolean isSubsequence(String s, String t) {
        Stack<Character> stack = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            stack.push(s.charAt(i));
        }

        for (int j = 0; j < t.length(); j++) {
            if (!stack.isEmpty() && stack.peek() == t.charAt(j)) {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
