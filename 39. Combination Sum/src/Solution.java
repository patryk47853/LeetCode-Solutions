import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);

        return result;
    }

    public void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int remain, int index) {
        if(remain < 0) return;
        else if(remain == 0) result.add(new ArrayList<>(tempList));
        for(int i = index; i<nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(result, tempList, nums, remain - nums[i], i);
            tempList.remove(tempList.size() - 1);
        }
    }
}