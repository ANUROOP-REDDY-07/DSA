
class Solution {
    int number=0;

    void dfs(ArrayList<Integer> graph[],int src,int[] component,boolean vis[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(src);

        while(!q.isEmpty()){
            int curr=q.remove();

            if(!vis[curr]){
            vis[curr]=true;
            component[curr]=number;

            for(int i=0;i<graph[curr].size();i++){
                int next=graph[curr].get(i);
                if(!vis[next]){
                q.add(graph[curr].get(i));
                }
            }
            }
        }
        
    }
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        boolean res[]=new boolean[queries.length];
        int component[]=new int[n];
        ArrayList<Integer> graph[]=new ArrayList[n];

        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }

         for(int i=0;i<n-1;i++){
            if(nums[i+1]-nums[i]<=maxDiff){
                graph[i].add(i+1);
                graph[i+1].add(i);
            }
        }

        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
            dfs(graph,i,component,vis);
            number++;
            }
        }


        for(int i=0;i<queries.length;i++){
            int src=queries[i][0];
            int dest=queries[i][1];
            if(component[src]==component[dest]){
                res[i]=true;
            }else{
                res[i]=false;
            }
        }

        return res;

    }
}