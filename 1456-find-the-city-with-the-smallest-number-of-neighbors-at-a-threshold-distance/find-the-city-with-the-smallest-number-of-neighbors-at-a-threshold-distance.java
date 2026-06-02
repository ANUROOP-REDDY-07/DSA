class Solution {
    public int findTheCity(int n, int[][] edges, int Threshold) {

        int adj[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                adj[i][j]=Integer.MAX_VALUE;
            }
        }

        for(int i=0;i<edges.length;i++){
            int[] curr=edges[i];
            int idxI=curr[0];
            int idxJ=curr[1];
            int wt=curr[2];
            adj[idxI][idxJ]=wt;
            adj[idxJ][idxI]=wt;
        }


        for(int via=0;via<n;via++){
            for(int a=0;a<n;a++){
                if(via==a) continue;
                for(int b=0;b<n;b++){
                    if(via==b) continue;
                    if(a==b) continue;

                    if(adj[a][via]!=Integer.MAX_VALUE && adj[via][b]!=Integer.MAX_VALUE){
                    adj[a][b]=Math.min(adj[a][b],adj[a][via]+adj[via][b]);
                    }
                }
            }
        }


        //  for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(adj[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        
        int minCnt=Integer.MAX_VALUE;
        int idx=-1;

        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(adj[i][j]<=Threshold){
                    cnt++;
                }
            }

            if(cnt<=minCnt){
                minCnt=cnt;
                idx=Math.max(idx,i);
            }
        }

        return idx;

    }
}