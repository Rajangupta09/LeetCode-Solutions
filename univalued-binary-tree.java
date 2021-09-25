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
    Integer val = null;
    public boolean isUnivalTree(TreeNode root) {
        if(root == null)return true;
        if(val != null && root.val  != val)return false;
        val = root.val;
        return isUnivalTree(root.left)&&isUnivalTree(root.right);
    }
}