package NeetCode.Trees;

public class DiameterofBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] result = new int[0];
        solve(root, result);
        return result[0];
    }

    public int solve(TreeNode root, int[] result) {
        if (root == null) return 0;
        int lh = solve(root.left, result);
        int rh = solve(root.right, result);
        result[0] = Math.max(result[0], lh + rh);
        return 1 + Math.max(lh, rh);
    }
}
