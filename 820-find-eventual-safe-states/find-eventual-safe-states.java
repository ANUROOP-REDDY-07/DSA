class Solution {
    void eventual(List<Integer> g[],int[] indeg,List<Integer> res){

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int ele=q.remove();
            res.add(ele);
            for(int i=0;i<g[ele].size();i++){
                int item=g[ele].get(i);
               indeg[item]--;
               if(indeg[item]==0){
                q.add(item);
               }
            }
        }
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        ArrayList<Integer> g[]=new ArrayList[graph.length];

        for(int i=0;i<g.length;i++){
            g[i]=new ArrayList<>();
        }

        for(int i=0;i<graph.length;i++){
            int temp[]=graph[i];
            for(int j=0;j<temp.length;j++){
                g[temp[j]].add(i);
            }
        }

        int indeg[]=new int[graph.length];
        for(int i=0;i<g.length;i++){
            indeg[i]=graph[i].length;
        }

        List<Integer> res=new ArrayList<>();
        eventual(g,indeg,res);
        Collections.sort(res);
        return res;
    }
}