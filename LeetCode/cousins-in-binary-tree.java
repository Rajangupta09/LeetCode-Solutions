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
    TreeNode rx;
    TreeNode ry;
    private boolean isSibling(TreeNode root,TreeNode x,TreeNode y){
        if(root == null) return false;
        return (root.left == x && root.right == y)||(root.left == y && root.right == x)||isSibling(root.left,x,y)||isSibling(root.right,x,y);
    }
    private int level(TreeNode root, int x, int level){
        if(root == null)return 0;
        if(root.val == x){  
            if(rx == null){
                rx = root;
            } else{
                ry = root;
            }
            return level;   
        }
        int l = level(root.left,x,level+1);
        if(l!= 0){
            return l;   
        }
        return level(root.right, x,level+1);
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        rx= null;
        ry=null;
        return(level(root,x,1)==level(root,y,1)&&!isSibling(root,rx,ry));
    }
}