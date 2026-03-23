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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();

        if(root==null){
            return res;
        }

        Queue<TreeNode> q=new LinkedList<>();
        boolean isCorrect=true;

        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();

            List<Integer> l =new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();

                l.add(curr.val);

                if(curr.left!=null){
                    q.add(curr.left);
                }

                if(curr.right!=null){
                    q.add(curr.right);
                }
            }

            if(!isCorrect){
                Collections.reverse(l);
            }

            res.add(l);
            isCorrect=!isCorrect;
        }
        return res;
    }
}