import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int nums2[] = {3,2,4};

        System.out.println(Arrays.toString(twoSum(nums, 9))); // Output: [0,1]
        System.out.println(Arrays.toString(twoSum(nums2, 6))); // Output: [1,2]
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i < nums.length; i++) {
            for (int j=i+1; j < nums.length; j++) {
                if(nums[j] == target - nums[i]) {
                    return new int[] {i, j};
                }
            }
        }

        return null;
    }
}