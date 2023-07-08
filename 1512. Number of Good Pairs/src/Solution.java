class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count[] = new int[101];

        for(int num : nums) {
            count[num]++;
        }

        int ans = 0;

        for(int num : count) {
            ans += ((num) * (num - 1)) / 2;
        }

        return ans;
    }
}