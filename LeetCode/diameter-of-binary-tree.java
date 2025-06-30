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
class Height{
    int h;
}
class Solution {
    public int getWidth(TreeNode root, Height height){
        Height lh = new Height(), rh = new Height();
        if(root == null){
            height.h = 0;
            return 0;
        }
        int ldia = getWidth(root.left,lh);
        int rdia = getWidth(root.right,rh);
        height.h = Math.max(lh.h,rh.h)+1;
        return Math.max(lh.h+rh.h+1, Math.max(ldia,rdia));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return getWidth(root,new Height())-1;
    }
}