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
    ArrayList<TreeNode> a=new ArrayList<>();
    int idx=0;
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }

        inorder(root.left);
        a.add(root);
        inorder(root.right);
        
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        inorder(root);
        int sum=0;
        for(int i=0;i<a.size();i++){
            int value=a.get(i).val;
            if(value>=low && value<=high){
                sum+=value;
            }
        }
        return sum;
    }
}