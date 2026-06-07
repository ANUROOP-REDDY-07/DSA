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
    public TreeNode createBinaryTree(int[][] descriptions) {

        Map<Integer,TreeNode> mp=new HashMap<>();
        Set<Integer> children=new HashSet<>();
        TreeNode ans;

        for(int i=0;i<descriptions.length;i++){
            int[] temp=descriptions[i];
            int parent=temp[0];
            int child=temp[1];
            int isLeft=temp[2];

            if(!mp.containsKey(parent)){
                mp.put(parent,new TreeNode(parent));
            }

            if(!mp.containsKey(child)){
                mp.put(child,new TreeNode(child));
            }

            if(isLeft==1){
                mp.get(parent).left=mp.get(child);
            }else{
                mp.get(parent).right=mp.get(child);
            }

            children.add(child);
        }


        for(int e:mp.keySet()){
            if(!children.contains(e)){
                return mp.get(e);
            }
        }

      return null;
        
    }
}