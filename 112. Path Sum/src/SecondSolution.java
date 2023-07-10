/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class SecondSolution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false; // empty tree
        }

        // leaf node
        if (root.left == null && root.right == null) {
            if (root.val - targetSum == 0) {
                return true;
            } else {
                return false; // backtrack
            }
        }

        if (hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val)) {
            return true;
        }
        return false;
    }
}