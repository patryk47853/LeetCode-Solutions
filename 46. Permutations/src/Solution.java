import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(result, new ArrayList<>(), nums);

        return result;
    }

    public void backtrack(List<List<Integer>> result,
                          ArrayList<Integer> tempArray, int[] nums) {

        if (tempArray.size() == nums.length) {
            result.add(new ArrayList<>(tempArray));
            return;
        }

        for (int num : nums) {
            if(tempArray.contains(num)) {
                continue;
            }

            tempArray.add(num);
            backtrack(result, tempArray, nums);
            tempArray.remove(tempArray.size() - 1);
        }
    }
}
