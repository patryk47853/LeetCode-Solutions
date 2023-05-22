public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {2,7,9,3,1};

        System.out.println(rob(nums1));
        System.out.println(rob(nums2));
    }

    public static int rob(int[] nums) {
        int even = 0;
        int odd = 0;
        int sum = 0;

        for(int i=0; i < nums.length; i++) {
            if(i%2 == 0) {
                even += nums[i];
            } else {
                odd += nums[i];
            }
        }

        if(even > odd) sum = even;
        else sum = odd;

        return sum;
    }
}