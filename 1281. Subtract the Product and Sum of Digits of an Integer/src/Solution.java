class Solution {
    public int subtractProductAndSum(int n) {
        char[] arr = String.valueOf(n).toCharArray();

        int[] nums = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            nums[i] = Character.getNumericValue(arr[i]);
        }

        int sum = nums[0];
        int product = nums[0];

        for(int i = 1; i < nums.length; i++) {
            sum = sum + nums[i];
            product = product * nums[i];
        }

        return product - sum;
    }
}