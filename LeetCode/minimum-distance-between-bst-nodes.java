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
    int ans;
    TreeNode prev;
    private void getDiff(TreeNode root){
        if(root == null)return;
        getDiff(root.left);
        if(prev!=null){
            ans = Math.min(ans, root.val-prev.val);
        }
        prev = root;
        getDiff(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        prev = null;
        ans = Integer.MAX_VALUE;
        getDiff(root);
        return ans;
    }
}