import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3)); // Output: ["((()))","(()())","(())()","()(())","()()()"]
        System.out.println(generateParenthesis(1)); // Output: ["()"]
    }

    public static List<String> generateParenthesis(int n) {

        List<String> output = new ArrayList<>();
        backtrack(output, "", n, 0, 0);

        return output;
    }

    public static void backtrack(List<String> output, String parentheses, int pairs, int open, int close) {

        if (parentheses.length() == pairs * 2) {
            output.add(parentheses);
            return;
        }

        if(open < pairs) backtrack(output, parentheses + "(", pairs,open + 1, close);
        if(close < open) backtrack(output, parentheses + ")", pairs, open, close +1);

    }
}