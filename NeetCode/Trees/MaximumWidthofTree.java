package NeetCode.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthofTree {
    public static int widthOfBinaryTree(TreeNode root) {
        // BFS
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        
        q1.add(root);
        int result = 0;
        while (!q1.isEmpty()) {
            result = Math.max(result, q1.size());
            TreeNode curr = q1.poll();

            q2.add(curr.left);
            q2.add(curr.right);

            if (q1.isEmpty()){
                Queue<TreeNode> temp = q1;
                q1 = q2;
                q2 = temp;
            }
        }
        return result;
    }
}
