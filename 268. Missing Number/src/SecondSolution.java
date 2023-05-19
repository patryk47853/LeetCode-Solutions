class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;

        for(int i=0; i<=nums.length; i++) {
            xor = xor ^ i;
        }

        for(int num : nums) {
            xor = xor ^ num;
        }

        return xor;
    }
}