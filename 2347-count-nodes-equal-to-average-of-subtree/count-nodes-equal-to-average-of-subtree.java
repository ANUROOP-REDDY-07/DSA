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
    int res=0;
    int[] findSum(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
        int left[]=findSum(root.left);
        int right[]=findSum(root.right);

        int sum=left[0]+right[0]+root.val;
        int cnt=left[1]+right[1]+1;
        return new int[]{sum,cnt};
    }
    public int averageOfSubtree(TreeNode root) {
        if(root==null){
            return 0;
        }

        int[] curr=findSum(root);
        int sum=curr[0];
        int count=curr[1];

        if(root.val==sum/count){
            res++;
        }

        averageOfSubtree(root.left);
        averageOfSubtree(root.right);

        return res;

    }
}