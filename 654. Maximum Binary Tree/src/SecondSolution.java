/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class SecondSolution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        Deque<TreeNode> deque = new LinkedList<>();
        for (int num : nums) {
            TreeNode current = new TreeNode(num);
            while (!deque.isEmpty() && deque.peek().val < num) {
                current.left = deque.pop();
            }
            if (!deque.isEmpty()) {
                deque.peek().right = current;
            }
            deque.push(current);
        }
        return deque.isEmpty() ? null : deque.removeLast();
    }
}