import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    public void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int index) {
        result.add(new ArrayList<>(tempList));

        for(int i=index; i<nums.length; i++) {
            tempList.add(nums[i]);

            backtrack(result, tempList, nums, i+1);

            tempList.remove(tempList.remove(tempList.size() - 1));
        }
    }
}