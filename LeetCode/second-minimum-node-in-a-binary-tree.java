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
    static long max;
    public static int findSecondMinimumValue(TreeNode root) {
        max = Long.MAX_VALUE;
        long ans = DFS(root);
        return ans == max?-1:(int)ans;
    }
    public static long DFS(TreeNode root){
        if(root.left!= null && root.right !=null){
            if(root.left.val<root.right.val){
                return Math.min(DFS(root.left),root.right.val);
            }else if(root.left.val>root.right.val){
                return Math.min(DFS(root.right), root.left.val);
            }else{
                return Math.min(DFS(root.left),DFS(root.right));
            }
        }
        return max;
    }
}