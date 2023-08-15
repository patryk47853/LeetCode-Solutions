class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = Integer.MIN_VALUE;  // Initialize the maximum average to a very small value
        double temp = 0;  // Initialize a temporary variable to store the sum of the current subarray

        // Calculate the sum of the first k - 1 indexed elements in the array
        for(int i = 0; i < k - 1; i++) {
            temp += nums[i];
        }

        // Iterate through the array starting from the kth element
        for(int i = k - 1; i < nums.length; i++) {
            temp += nums[i];  // Add the current element to the temporary sum
            ans = Math.max(ans, temp);  // Update the maximum sum if the current average is higher
            temp -= nums[i - k + 1];  // Remove the oldest element from the subarray sum
        }

        return ans / k;  // Return the maximum average
    }
}
