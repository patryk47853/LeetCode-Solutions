import static java.util.Arrays.sort;

public class Solution {
    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2}; // Input array
        int val = 2; // Value to remove
        int[] expectedNums = {0,1,3,0,4}; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        int k = removeElement(nums, val); // Calls your implementation
        int actualLength = nums.length;

        assert k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < actualLength; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    public static int removeElement(int[] nums, int val) {

        int i = 0;

        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
            }
        }

        return i;
    }
}