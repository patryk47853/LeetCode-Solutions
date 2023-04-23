import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public List<List<Integer>> permute(int[] nums) {

        LinkedList<List<Integer>> result = new LinkedList();
        int current_size = 0;
        result.add(new ArrayList<>());

        for (int i=0; i < nums.length - 1; i++) {
            current_size = result.size();

            while (current_size > 0) {
                List<Integer> permutation = result.pollFirst();
                for (int j=0; j <= permutation.size(); j++) {
                    List<Integer> thePermutation = new ArrayList<>(permutation);
                    thePermutation.add(j, nums[i]);
                    result.add(thePermutation);
                }

                current_size--;
            }
        }

        return result;
    }
}