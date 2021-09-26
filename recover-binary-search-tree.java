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
    TreeNode first, mid,last,prev;
    private void recover(TreeNode root){
        if(root == null)return;
        recover(root.left);
        if(prev==null){
            prev = root;
        }
        if(first==null && prev.val>root.val){
            first = prev;
            mid = root;
        }else if(prev.val>root.val){
            last = root;
        }
        prev = root;
        recover(root.right);
    }
    private void swap(TreeNode x, TreeNode y){
        int t = x.val;
        x.val = y.val;
        y.val = t;
    }
    public void recoverTree(TreeNode root) {
        first = null;mid=null;last=null;prev=null;
        recover(root);
        if(last == null){
            swap(first,mid);
        }else{
            swap(first,last);
        }
        
    }
}