class SecondSolution {
    public int maxProduct(int[] nums) {
        int size = nums.length;
        int left = 1;
        int right = 1;
        int result = nums[0];

        for (int i = 0; i < size; i++) {
            left = left == 0 ? 1 : left;
            right = right == 0 ? 1 : right;

            left *= nums[i];

            right *= nums[size - 1 - i];

            result = Math.max(result, Math.max(left, right));
        }

        return result;
    }
}