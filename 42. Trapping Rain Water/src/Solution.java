class Solution {
    public int trap(int[] height) {
        // Initialize variables
        int left = 0; // Pointer for the left side
        int right = height.length - 1; // Pointer for the right side
        int leftMax = height[0]; // Maximum height encountered on the left side
        int rightMax = height[height.length - 1]; // Maximum height encountered on the right side
        int water = 0; // Variable to store the accumulated water

        // Loop until the left and right pointers meet
        while (left < right) {
            if (leftMax < rightMax) {
                // Move the left pointer to the right
                left++;

                // If the current height is greater than the leftMax, update leftMax
                if (leftMax < height[left]) {
                    leftMax = height[left];
                } else {
                    // Otherwise, accumulate the trapped water
                    water += leftMax - height[left];
                }
            } else {
                // Move the right pointer to the left
                right--;

                // If the current height is greater than the rightMax, update rightMax
                if (rightMax < height[right]) {
                    rightMax = height[right];
                } else {
                    // Otherwise, accumulate the trapped water
                    water += rightMax - height[right];
                }
            }
        }

        return water; // Return the total trapped water
    }
}
