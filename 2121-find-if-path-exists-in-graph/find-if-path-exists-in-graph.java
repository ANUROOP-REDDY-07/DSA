class Solution {
    public void bfs(ArrayList<Integer> graph[],boolean vis[],int source,int destination){
        
        Queue<Integer> q=new LinkedList<>();

        q.add(source);
        vis[source]=true;

        while(!q.isEmpty()){
            int curr=q.remove();
            for(int i=0;i<graph[curr].size();i++){
                int dest=graph[curr].get(i);
                if(!vis[dest]){
                    q.add(dest);
                    vis[dest]=true;
                    if(dest==destination){
                    return;
                   }
                }
            }
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        if(source==destination){
            return true;
        }
        ArrayList<Integer> graph[]=new ArrayList[n];
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }

        for(int i=0;i<edges.length;i++){
            int src=edges[i][0];  
            int dest=edges[i][1];   

            graph[src].add(dest);
            graph[dest].add(src);

        }

        bfs(graph,vis,source,destination);
        

        return vis[destination];
       
    }
}