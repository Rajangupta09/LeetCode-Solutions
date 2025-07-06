package NeetCode.BinarySearch.Trees;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
      boolean[] result = new boolean[1];
        result[0] = true;
        solve(root, result);
        return result[0];
    }

    static int solve(TreeNode root, boolean[] result) {
        if (root == null) return 0;
        if (result[0]) {
            int lh = solve(root.left, result);
            int rh = solve(root.right, result);
            if (Math.abs(lh - rh) > 1) {
                result[0] = false;
            }
            return 1 + Math.max(lh, rh);
        } else {
            return 0;
        }
    }
}
