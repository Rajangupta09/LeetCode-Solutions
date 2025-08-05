package NeetCode.Trees;

public class SubtreeofAnotherTree {

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }

        if (sameTree(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }

    public static boolean sameTree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root != null && subRoot != null && root.val == subRoot.val) {
            return sameTree(root.left, subRoot.left) &&
                   sameTree(root.right, subRoot.right);
        }
        return false;
    }

    public static void main(String[] args) {

    }    
}
