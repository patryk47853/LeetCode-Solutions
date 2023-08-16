class Solution {
    public boolean canJump(int[] nums) {
        int ans = nums.length - 1;
        int index = nums.length - 2;

        for (int i = index; i >= 0; i--) {
            if (i + nums[i] >= ans) {
                ans = i;
            }
        }

        return ans == 0;
    }
}