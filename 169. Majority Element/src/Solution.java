class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int size = nums.length;
        int majority = size / 2;

        for (int i = 0; i < size; i++) {
            int num = nums[i];

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }

            if (map.get(num) > majority) {
                return num;
            }
        }

        throw new IllegalArgumentException("No majority element found.");
    }
}