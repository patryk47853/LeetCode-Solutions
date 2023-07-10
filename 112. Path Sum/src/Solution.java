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
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        Stack<TreeNode> path = new Stack<>();
        Stack<Integer> sum = new Stack<>();

        path.push(root);
        sum.push(root.val);

        while(!path.isEmpty()) {
            TreeNode tempNode = path.pop();
            int tempVal = sum.pop();

            if(tempNode.right == null && tempNode.left == null &&
                    tempVal == targetSum) return true;

            if(tempNode.right != null) {
                path.push(tempNode.right);
                sum.push(tempNode.right.val + tempVal);
            }

            if(tempNode.left != null) {
                path.push(tempNode.left);
                sum.push(tempNode.left.val + tempVal);
            }
        }

        return false;
    }
}