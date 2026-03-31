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

    public void dfs(TreeNode root,int row,int col,List<int[]>nodes ){
        if(root==null){
            return;
        }
        nodes.add(new int[]{col,row,root.val});
        dfs(root.left,row+1,col-1,nodes);
        dfs(root.right,row+1,col+1,nodes);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<int[]> nodes=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();

        dfs(root,0,0,nodes);

        nodes.sort((a,b)->{
            if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
            if(a[1]!=b[1]) return Integer.compare(a[1],b[1]);

            return Integer.compare(a[2],b[2]);
        });

        int prevcol=Integer.MIN_VALUE;
        for(int[] item:nodes){
            int col=item[0],val=item[2];
            if(prevcol!=col){
                res.add(new ArrayList<>());
                prevcol=col;
            }
            res.get(res.size()-1).add(val);
        }
    return res;
    }
}