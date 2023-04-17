import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {2,2,1};
        int[] nums2 = {4,1,2,1,2};
        int[] nums3 = {1};


        System.out.println(singleNumber(nums1)); // should return 1
        System.out.println(singleNumber(nums2)); // should return 4
        System.out.println(singleNumber(nums3)); // should return 1
    }

    public static int singleNumber(int[] nums) {

        int temp = 0;

        for(int i=0; i<nums.length; i++) {
            temp ^= nums[i];
        }

        return temp;
    }
}