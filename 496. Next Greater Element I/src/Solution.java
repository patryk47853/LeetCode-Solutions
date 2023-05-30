class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack();
        HashMap<Integer, Integer> ans = new HashMap<>();

        for(int num : nums2) {
            while(!stack.isEmpty() && stack.peek() < num) {
                ans.put(stack.pop(), num);
            }

            stack.push(num);
        }

        for(int i = 0; i < nums1.length; i++) {
            nums1[i] = ans.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }
}