class Pair{
    int r,c,cnt;
    Pair(int r,int c,int cnt){
        this.r=r;
        this.c=c;
        this.cnt=cnt;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<Pair> q=new LinkedList<>();

        int dir1[]=new int[]{-1,0,1,0};
        int dir2[]=new int[]{0,1,0,-1};

        int ones=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                }

                if(grid[i][j]==1){
                    ones++;
                }
            }
        }

        if(ones==0){
            return 0;
        }

        int maxCnt=Integer.MIN_VALUE;

        while(!q.isEmpty()){
            Pair curr=q.remove();
            int row=curr.r;
            int col=curr.c;
            int cnt=curr.cnt;
            maxCnt=Math.max(maxCnt,cnt);


            for(int i=0;i<4;i++){
                int currRow=row+dir1[i];
                int currCol=col+dir2[i];

                if(currRow>=0 && currCol>=0 && currRow<m && currCol<n && grid[currRow][currCol]==1){
                    grid[currRow][currCol]=2;
                    ones--;
                    q.add(new Pair(currRow,currCol,cnt+1));
                }
            }
        
        }

        return ones==0?maxCnt:-1;
    }
}