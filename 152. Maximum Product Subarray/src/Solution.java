public class Solution {
    public static void main(String[] args) {
        int[] nums = {-3, 0, 1, -2};

        System.out.println(maxProduct(nums)); // Output: 1
    }

    public static int maxProduct(int[] nums) {
        int left = 1;
        int right = 1;
        int result = nums[0];
        int size = nums.length - 1;

        for (int i = 0; i < size; i++) {
            if (left * nums[i] == 0) left = 1;
            left = left * nums[i];
            if (left > result) result = left;
        }
        for (int j = size; j >= 0; j--) {
            if (right * nums[j] == 0) right = 1;
            right = right * nums[j];
            if (right > result) result = right;
        }

        return result;
    }
}
