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
    private int getSum(TreeNode root, int low,int high){
        int sum =0;
        if(root == null)return 0;
        if(root.val>=low&&root.val<=high)sum += root.val;
        return sum+getSum(root.left,low,high) + getSum(root.right,low,high);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        return getSum(root,low,high);
    }
}