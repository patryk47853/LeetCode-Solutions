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
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);

        boolean flag = false;

        while (!treeNodeQueue.isEmpty()) {
            int size = treeNodeQueue.size();
            List<Integer> tempList = new ArrayList<>();
            Stack<Integer> reverseStack = new Stack<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = treeNodeQueue.poll();

                if (flag) {
                    reverseStack.add(node.val);
                } else {
                    tempList.add(node.val);
                }

                if (node.left != null) treeNodeQueue.add(node.left);
                if (node.right != null) treeNodeQueue.add(node.right);
            }

            flag = !flag;

            while (!reverseStack.isEmpty()) {
                tempList.add(reverseStack.pop());
            }

            result.add(tempList);
        }
        return result;
    }
}