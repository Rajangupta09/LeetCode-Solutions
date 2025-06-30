/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public void postOrder(Node root, List<Integer> ls){
        if(root == null)return;
        for(Node i:root.children){
            postOrder(i, ls);
        }
        ls.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer> ls = new ArrayList<Integer>();
        postOrder(root,ls);
        return ls;
    }
}