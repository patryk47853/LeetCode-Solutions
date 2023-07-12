/* The code below is working, however, it's relatively slow and not accepted by LeetCode
* due to Time Limit Exception */

class SlowSolution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> table = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (table.containsKey(nums[i])) {
                table.put(nums[i], table.get(nums[i]) + 1);
            } else {
                table.put(nums[i], 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (table.get(nums[i]) > 1 && !ans.contains(nums[i])) {
                ans.add(nums[i]);
            }
        }

        return ans;
    }
}
