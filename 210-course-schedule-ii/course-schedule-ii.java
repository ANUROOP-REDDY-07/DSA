class Solution {

    public void topSort(int numCourses,ArrayList<Integer> graph[],int[] indeg,ArrayList<Integer> al){
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<numCourses;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int curr=q.remove();
            al.add(curr);
            for(int e:graph[curr]){
                indeg[e]--;
                if(indeg[e]==0){
                    q.add(e);
                }
            }
        }


    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        if(numCourses==1){
            return new int[]{0};
        }

        int indeg[]=new int[numCourses];
        ArrayList<Integer> graph[]=new ArrayList[numCourses];

        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<Integer>();
        }

        for(int i=0;i<prerequisites.length;i++){
            int stNode=prerequisites[i][1];
            int endNode=prerequisites[i][0];

            graph[stNode].add(endNode);
            indeg[endNode]++;
        }

        ArrayList<Integer> al=new ArrayList<>();
        topSort(numCourses,graph,indeg,al);

        if(al.size()<numCourses){
            return new int[]{};
        }

        int res[]=new int[numCourses];
        for(int i=0;i<al.size();i++){
            res[i]=al.get(i);
        }

        return res;
    }
}