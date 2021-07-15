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
    public String getVal(int[] arr,int n){
        String s= new String();
        for(int i = 0;i<n;i++){
            if(i == (n-1)){
                s+=arr[i];
                break;
            }else{
                s += arr[i]+ "->";
            }
            
        }
        return s;
    }
    public void getPath(TreeNode root, int[] arr,int len, List<String> ans){
        if(root==null)return;
        arr[len++] = root.val;
        if(root.left==null&&root.right==null){
            ans.add(getVal(arr,len));
            return;
        }else{
            getPath(root.left, arr, len, ans);
            getPath(root.right, arr,len, ans);
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null)return null;
        int[] arr = new int[100];
        List<String> ans = new ArrayList<String>();
        getPath(root,arr,0,ans);
        return ans;
        
    }
}