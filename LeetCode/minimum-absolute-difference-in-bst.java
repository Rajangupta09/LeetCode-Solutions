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
    public void inOrder(TreeNode root, ArrayList ls){
        if(root == null) return;
        inOrder(root.left, ls);
        ls.add(root.val);
        inOrder(root.right, ls);
    }
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        inOrder(root, ls);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<ls.size()-1;i++){
            if(ls.get(i+1) -ls.get(i)<min){
                min = ls.get(i+1) -ls.get(i);
            }
        }
        return min;
    }
}