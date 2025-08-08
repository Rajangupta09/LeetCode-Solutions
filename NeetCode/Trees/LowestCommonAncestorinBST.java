package NeetCode.Trees;

public class LowestCommonAncestorinBST {
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return root;

        if (q.val < root.val && p.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (q.val > root.val && p.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
    
    public static void main(String[] args) {
        
    }
}
