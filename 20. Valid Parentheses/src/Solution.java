import java.util.Stack;

public class Solution {
    public static void main(String[] args) {

        System.out.println(isValid("()")); // should return true
        System.out.println(isValid("()[]{}")); // should return true
        System.out.println(isValid("(]")); // should return false
        System.out.println(isValid("[({})]")); // should return true
    }

    public static boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}