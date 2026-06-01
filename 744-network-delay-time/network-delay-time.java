class Pair implements Comparable<Pair>{
    int node;
    int cost;
    Pair(int node,int cost){
        this.node=node;
        this.cost=cost;
    }

    @Override
    public int compareTo(Pair p){
        return this.cost-p.cost;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        //adjacency list
        ArrayList<Pair> graph[]=new ArrayList[n+1];

        for(int i=0;i<=n;i++){
            graph[i]=new ArrayList<>();
        }

        for(int i=0;i<times.length;i++){
            int src=times[i][0];
            int dest=times[i][1];
            int cost=times[i][2];
            graph[src].add(new Pair(dest,cost));
        }


        int dist[]=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;

        //priority queue
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(k,0));

        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            int node=curr.node;
            int cost=curr.cost;
            if(cost>dist[node]) continue;
            for(Pair p:graph[node]){
                int currcost=p.cost;
                if(cost+currcost<dist[p.node]){
                    dist[p.node]=cost+currcost;
                    pq.add(new Pair(p.node,cost+currcost));
                }
            }
        }

        int max=Integer.MIN_VALUE;
        for(int i=1;i<dist.length;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;
            max=Math.max(dist[i],max);
        }

        return max;
    }
}