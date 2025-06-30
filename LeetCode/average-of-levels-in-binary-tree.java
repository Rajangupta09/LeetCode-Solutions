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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<Double>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        long count =0,sum =0;
        while(!q.isEmpty()){
            count = 0;
            sum =0;
            Queue<TreeNode> t = new LinkedList<TreeNode>();
            while(!q.isEmpty()){
                TreeNode temp = q.peek();
                q.remove();
                if(temp.left!=null)t.add(temp.left);
                if(temp.right!=null)t.add(temp.right);
                sum+=temp.val;
                count++;
            }
            res.add((double)sum/count);
            q = t;
        }
        return res;
    }
}