public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int index = m + n - 1;
        int currentM = m - 1;
        int currentN = n - 1;

        while (currentM >= 0 && currentN >= 0) {
            if (nums1[currentM] > nums2[currentN]) {
                nums1[index] = nums1[currentM];
                currentM--;
            } else {
                nums1[index] = nums2[currentN];
                currentN--;
            }
            index--;
        }

        while (currentN >= 0) {
            nums1[index] = nums2[currentN];
            currentN--;
            index--;
        }
    }
}