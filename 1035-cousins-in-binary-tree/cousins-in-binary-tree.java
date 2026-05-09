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

    boolean sibiling = false;

    public boolean isCousins(TreeNode root, int x, int y) {
        int[] level = new int[2];

        dfs(root, x, y, level, 0);

        return (level[0] == level[1]) && !sibiling;
    }

    boolean dfs(TreeNode root, int x, int y, int[] level, int h) {

        if (root == null) {
            return false;
        }

        boolean left = dfs(root.left, x, y, level, h + 1);
        boolean right = dfs(root.right, x, y, level, h + 1);

        if (left && right) {
            sibiling = true;
        }

        if (root.val == x) {
            level[0] = h;
            return true;
        }

        if (root.val == y) {
            level[1] = h;
            return true;
        }
        return false;
    }
}