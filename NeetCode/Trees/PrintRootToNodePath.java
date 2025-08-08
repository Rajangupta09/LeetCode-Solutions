package NeetCode.Trees;

import java.util.ArrayList;
import java.util.List;

public class PrintRootToNodePath {
     public static List<List<Integer>> allRootToLeaf(TreeNode root) {
        //your code goes here
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, result, new ArrayList<>());
        return result;
    }

    public static void dfs(TreeNode root, List<List<Integer>> result, List<Integer> curr) {
        if (root == null) {
            result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(root.val);
        dfs(root.left, result, curr);
        dfs(root.right, result, curr);
        curr.remove(curr.size()-1);
    }
}
