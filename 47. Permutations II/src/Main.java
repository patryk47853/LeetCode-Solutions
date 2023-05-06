import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);

        return result;
    }

    public void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used) {
        if(result.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for(int i=0; i < nums.length; i++) {
                if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
                tempList.add(nums[i]);
                used[i] = true;
                backtrack(result, tempList, nums, used);
                used[i] = false;
                tempList.remove((tempList.size() - 1));
            }
        }

    }
}