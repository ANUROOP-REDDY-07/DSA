class Solution {
    public void bfs(int node,int[][] isConnected,boolean[] vis){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        vis[node]=true;

        while(!q.isEmpty()){
            int curr=q.remove();
            for(int j=0;j<isConnected.length;j++){
                if(isConnected[curr][j]==1 && !vis[j]){
                    q.add(j);
                    vis[j]=true;
                }
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        boolean vis[]=new boolean[isConnected.length];
        int cnt=0;
        for(int i=0;i<isConnected.length;i++){
            if(!vis[i]){
                bfs(i,isConnected,vis);
                cnt++;
            }
        }
        return cnt;
    }
}