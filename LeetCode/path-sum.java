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
    public boolean getSum(TreeNode root, int targetSum){
        int sum = targetSum-root.val;
        boolean ans = false;
        if(sum == 0&&root.left == null&&root.right==null){
            return true;
        }
        if(root.left!=null)ans = ans||getSum(root.left, sum);
        if(root.right!=null)ans = ans||getSum(root.right, sum);
        return ans;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        return getSum(root,targetSum);   
    }
}