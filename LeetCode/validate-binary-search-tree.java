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
    Integer prev = null;
    boolean ans = true;
    public boolean isValidBST(TreeNode root) {
        if(root == null)return true;
        if(ans){
            ans = ans && isValidBST(root.left);
            if(prev==null){
                prev = root.val;
            }
            else if(prev < root.val){
                ans = ans && true;
                prev = root.val;
            }else{
                ans = false;
            }
            ans = ans && isValidBST(root.right);  
        }
        
        return  ans;
    }
}