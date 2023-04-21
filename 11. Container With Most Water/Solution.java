public class Solution {
    public static void main(String[] args) {
        int[] theHeight = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(theHeight)); // should return 49
    }

    public static int maxArea(int[] height) {

        int max_area = 0;
        int a_pointer = 0;
        int b_pointer = height.length - 1;

        while (a_pointer < b_pointer) {
            if (height[a_pointer] < height[b_pointer]) {
                max_area = Math.max(max_area, height[a_pointer] * (b_pointer - a_pointer));
                a_pointer++;
            } else {
                max_area = Math.max(max_area, height[b_pointer] * (b_pointer - a_pointer));
                b_pointer--;
            }
        }

        return max_area;
    }
}