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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        s1.push(root1);
        s2.push(root2);
        while(!s1.isEmpty()||!s2.isEmpty()){
            if(s1.isEmpty()||s2.isEmpty())return false;
            TreeNode temp1 = s1.pop();
            while(temp1!=null && !(temp1.left==null && temp1.right==null)){
                if(temp1.right!=null)s1.push(temp1.right);
                if(temp1.left!=null)s1.push(temp1.left);
                temp1 = s1.pop();
            }
            TreeNode temp2 = s2.pop();
            while(temp2!=null && !(temp2.left==null && temp2.right==null)){
                if(temp2.right!=null)s2.push(temp2.right);
                if(temp2.left!=null)s2.push(temp2.left);
                temp2 = s2.pop();
            }
            if(temp1!=null&&temp2==null){return false;}
            if(temp1==null&&temp2!=null){
                return false;
            }if(temp1!=null&&temp2!=null){
                if(temp1.val!=temp2.val)return false;
            }
        }
        return true;
    }
}