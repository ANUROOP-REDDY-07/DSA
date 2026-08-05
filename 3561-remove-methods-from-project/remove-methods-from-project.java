class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        ArrayList<Integer> graph[]=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }

        int indeg[]=new int[n];
        boolean sus[]=new boolean[n];

        for(int i=0;i<invocations.length;i++){
            int u=invocations[i][0];
            int v=invocations[i][1];
            graph[u].add(v);
            indeg[v]++;
        }

        Queue<Integer> q=new LinkedList<>();
        q.add(k);
        sus[k]=true;

        while(!q.isEmpty()){
            int curr=q.remove();

            for(int i=0;i<graph[curr].size();i++){
                int dest=graph[curr].get(i);
                indeg[dest]--;
                if(!sus[dest]){
                    q.add(dest);
                    sus[dest]=true;
                }
            }
        }

        boolean isOuterCall=false;

        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){

            if(sus[i] && indeg[i]>0){
                isOuterCall=true;
                break;
            }

            if(!sus[i]){
                res.add(i);
            }
        }

        if(isOuterCall){
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                l.add(i);
            }
            return l;
        }
        return res;

    }
}