class ConstSpaceSolution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Use the original value at nums[i] to store the new value
            // The new value will be composed of two parts: original value at nums[nums[i]] % n and the old value at nums[i]
            nums[i] += (nums[nums[i]] % n) * n;
        }

        for (int i = 0; i < n; i++) {
            // Retrieve the new value from nums[i] by dividing it by n
            nums[i] /= n;
        }

        return nums;
    }
}