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
    int max,prev,curr_max;
    public void getMax(TreeNode root){
        if(root == null)return;
        getMax(root.left);
        
        if(prev == root.val){
            curr_max++;
        }else{
            curr_max = 1;
            prev = root.val; 
        }
        max = Math.max(max,curr_max);
        getMax(root.right);
    }
    
    public void getDub(TreeNode root, ArrayList<Integer> res){
        if(root == null)return;
        getDub(root.left,res);
        if(prev == root.val){
            curr_max++;
        }else{
            curr_max = 1;
            prev = root.val; 
        }
        if(curr_max == max){
            res.add(root.val);
        }
        getDub(root.right,res);
    }
    
    public int[] findMode(TreeNode root) {
        max = 0;prev = 0;curr_max = 0;
        getMax(root);
        prev = 0;curr_max = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        getDub(root, res);
        int[] r = new int[res.size()];
        for(int i=0;i<res.size();i++){
            r[i] = res.get(i).intValue();
        }
        return r;
    }
}