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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);

        while(!treeNodeQueue.isEmpty()) {
            int size = treeNodeQueue.size();
            List<Integer> tempList = new ArrayList<>();
            while(size-- > 0) {
                TreeNode treeNode = treeNodeQueue.poll();
                tempList.add(treeNode.val);

                if(treeNode.left != null) treeNodeQueue.add(treeNode.left);

                if(treeNode.right != null) treeNodeQueue.add(treeNode.right);
            }
            result.add(tempList);
        }
        return result;
    }
}