class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] output = new int[size * 2];

        for(int i = 0; i < nums.length; i++) {
            output[i] = nums[i];
            output[i + size] = nums[i];
        }

        return output;
    }
}