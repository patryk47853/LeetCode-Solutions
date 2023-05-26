class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> ans = new HashSet<>();

        for(int num : nums) {
            if(ans.contains(num)) return true;

            ans.add(num);
        }

        return false;
    }
}
