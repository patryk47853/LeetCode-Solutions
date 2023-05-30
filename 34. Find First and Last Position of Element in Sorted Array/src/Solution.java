import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,8,8,10};

        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }

    public int[] searchRange(int[] nums, int target) {

        int start = findLeftBound(nums, target);
        int end = findRightBound(nums, target);

        return new int[]{start, end};
    }

    public int findLeftBound(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] >= target) right = mid - 1;
            if(nums[mid] < target) left = mid + 1;
            if(nums[mid] == target) index = mid;
        }

        return index;
    }

    public int findRightBound(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] <= target) left = mid + 1;
            if(nums[mid] > target) right = mid - 1;
            if(nums[mid] == target) index = mid;
        }

        return index;
    }
}