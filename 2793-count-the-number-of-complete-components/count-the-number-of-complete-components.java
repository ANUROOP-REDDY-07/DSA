class Solution {

    void bfs(ArrayList<Integer> graph[],int src,boolean vis[],int res[]){

        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        vis[src]=true;

        while(!q.isEmpty()){
            int curr=q.remove();
            res[0]++;
            res[1]+=graph[curr].size();

            for(int i=0;i<graph[curr].size();i++){
                int dest=graph[curr].get(i);
                if(!vis[dest]){
                    q.add(dest);
                    vis[dest]=true;
                }
            }
        }
    }
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<Integer> graph[]=new ArrayList[n];
        boolean vis[]=new boolean[n];
        int noOfComp=0;
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }

        for(int i=0;i<edges.length;i++){
            int src=edges[i][0];
            int dest=edges[i][1];
            graph[src].add(dest);
            graph[dest].add(src);
        }

        for(int i=0;i<n;i++){
            int res[]=new int[2];
            if(!vis[i]){
                bfs(graph,i,vis,res);
                res[1]=res[1]/2;

                if(res[1]==(res[0]*(res[0]-1))/2){
                    noOfComp++;
                }

            }
        }
        return noOfComp;
    }
}