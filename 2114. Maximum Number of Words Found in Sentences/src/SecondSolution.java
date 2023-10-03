class SecondSolution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;

        for(String s : sentences) {
            int current = s.split(" ").length;
            ans = Math.max(current, ans);
        }

        return ans;
    }
}