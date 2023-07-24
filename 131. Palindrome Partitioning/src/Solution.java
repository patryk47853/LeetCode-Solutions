class Solution {
    public List<List<String>> partition(String s) {
        if(s == null || s.length() == 0) return new ArrayList<>();

        List<List<String>> ans = new ArrayList<>();
        backtrack(s, ans, new ArrayList<>());

        return ans;
    }

    public void backtrack(String s, List<List<String>> ans, List<String> part) {
        if(s == null || s.length() == 0) {
            ans.add(new ArrayList<>(part));
            return;
        }

        for(int i = 1; i <= s.length(); i++) {
            String temp = s.substring(0, i);

            if(!isPalindrome(temp)) continue;

            // We add 'temp' to part list, call backtracking and then remove 'temp'
            part.add(temp);
            backtrack(s.substring(i, s.length()), ans, part);
            part.remove(part.size() - 1);
        }

        return;
    }

    public boolean isPalindrome(String temp) {
        // Binary search:
        int left = 0;
        int right = temp.length() - 1;

        while(left <= right) {
            if(temp.charAt(left) != temp.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}