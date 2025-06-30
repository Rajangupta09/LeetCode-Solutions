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
    TreeNode curr;
    private void inOrder(TreeNode root){
        if(root==null)return;
        inOrder(root.left);
        curr.right = new TreeNode(root.val);
        curr = curr.right;
        inOrder(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        curr = new TreeNode();
        TreeNode temp = curr;
        inOrder(root);
        return temp.right;
    }
}