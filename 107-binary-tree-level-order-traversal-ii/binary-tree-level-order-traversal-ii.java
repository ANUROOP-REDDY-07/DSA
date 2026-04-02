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
    List<List<Integer>> res=new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<Integer> temp=new ArrayList<>();

        if(root==null){
            return res;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode node=q.remove();
            if(node==null){
                res.add(temp);
                temp=new ArrayList<>();
                if(q.isEmpty()){
                   break;
                }else{
                    q.add(null);
                }

            }else{
                temp.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
        }

       int i=0;
       int j=res.size()-1;
       while(i<j){
        List<Integer> t=res.get(i);
        res.set(i,res.get(j));
        res.set(j,t);
        i++;
        j--;
       }
       return res;
    }
}