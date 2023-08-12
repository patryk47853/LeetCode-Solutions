class BetterSolution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : arr) {
            StringBuilder reversed = new StringBuilder(word);
            reversed.reverse();
            sb.append(reversed).append(" ");
        }

        return sb.toString().trim();
    }
}
