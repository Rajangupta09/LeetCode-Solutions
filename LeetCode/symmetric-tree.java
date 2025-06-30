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
     public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p!=null && q!=null)
        {
            return (p.val == q.val && isSameTree(p.left,q.right) &&  isSameTree(p.right,q.left));
        }
        return false;
        
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null || root.left == null && root.right == null){
            return true;
            
        }
        return isSameTree(root.left,root.right);
        
    }
}