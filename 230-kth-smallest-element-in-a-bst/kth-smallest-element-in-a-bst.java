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
    public void inorder(TreeNode root,List res){
        if(root==null){
            return;
        }

        inorder(root.left,res);
        res.add(root);
        inorder(root.right,res);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<TreeNode> res=new ArrayList<>();
        inorder(root,res);

        return res.get(k-1).val;
    }
}