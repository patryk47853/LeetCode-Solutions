public class Solution {

    public static void main(String[] args) {

        int nums1[] = {1,1,2};
        int nums2[] = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums1)); // Output: 2, nums = [1,2,_]
        System.out.println(removeDuplicates(nums2)); // Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    }

    public static int removeDuplicates(int[] nums) {
        int j=1;

        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] != nums[i+1]) {
                nums[j++] = nums[i+1];
            }
        }

        return j;
    }
}