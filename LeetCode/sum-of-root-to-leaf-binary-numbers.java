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
    int sum;

    private void getSum(TreeNode root, String s){
        if(root == null){
            return;
        }
        if(root.left==null&&root.right==null){
            s = s+root.val;
            sum+=Integer.parseInt(s,2);
        }
        getSum(root.left,s+root.val);
        getSum(root.right,s+root.val);
    }
    public int sumRootToLeaf(TreeNode root) {
        sum = 0;
        getSum(root, "");
        return sum;
    }
}