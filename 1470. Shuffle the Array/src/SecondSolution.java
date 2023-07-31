class SecondSolution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;

        // Store the pair of numbers in the right half of the array
        for (int i = n; i < len; i++) {
            nums[i] = (nums[i] << 10) | nums[i - n];
        }

        int index = 0;

        // Retrieve values from the pair of numbers and place them at their desired positions
        for (int i = n; i < len; i++, index += 2) {
            nums[index] = nums[i] & 1023;
            nums[index + 1] = nums[i] >>> 10;
        }

        return nums;
    }
}
