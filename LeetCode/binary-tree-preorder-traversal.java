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
    public void preorder(TreeNode head, List<Integer> li){
        if (head == null){
            return;
        }
        li.add(head.val);
        preorder(head.left, li);
        preorder(head.right,li);
        
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<Integer>();
        preorder(root, li);
        return li;
        
    }
}