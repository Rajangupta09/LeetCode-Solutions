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
    public void postorder(TreeNode head, List<Integer> li){
      if (head == null){
          return;
      }
      postorder(head.left, li);
      postorder(head.right,li);
      li.add(head.val);
      
  }
  public List<Integer> postorderTraversal(TreeNode root) {
      List<Integer> li = new ArrayList<Integer>();
      postorder(root, li);
      return li;
  }
}