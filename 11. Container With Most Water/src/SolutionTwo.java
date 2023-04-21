class SolutionTwo {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int myHeight = Math.min(height[left], height[right]);
            int myWidth = right - left;
            int area = myHeight * myWidth;
            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                left++;
                right--;
            }
        }

        return maxArea;
    }
}