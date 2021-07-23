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
class Res{
    int res=0;
}
class Solution {
    public int getTilt(TreeNode root, Res r){
        if(root == null)return 0;
        int left = getTilt(root.left, r);
        int right = getTilt(root.right,r);
        r.res += Math.abs(left-right);
        return left+right+root.val;
        
    }
    public int findTilt(TreeNode root) {
        Res r = new Res();
        getTilt(root,r);
        return r.res;
        
    }
}