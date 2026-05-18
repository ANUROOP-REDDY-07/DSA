class Pair{
    int row;
    int col;
    Pair(int i,int j){
        this.row=i;
        this.col=j;
    }
}

class Solution {
    public void bfs(int i,int j,char[][] grid,boolean[][] vis){
        Queue<Pair> q=new LinkedList<>();
        int m=grid.length;
        int n=grid[0].length;
        q.add(new Pair(i,j));

        while(!q.isEmpty()){
            Pair curr=q.remove();
            int row=curr.row;
            int col=curr.col;

            //top -> (row-1,col)
            if(row>0 ){
                if(!vis[row-1][col] && grid[row-1][col]=='1'){
                q.add(new Pair(row-1,col));
                vis[row-1][col]=true;
                }
            }

            //bottom->(row+1,col)

            if((row+1)<m){
                if(!vis[row+1][col] && grid[row+1][col]=='1'){
                    q.add(new Pair(row+1,col));
                    vis[row+1][col]=true;
                }
            }

            //left-> (row,col-1)

            if(col>0){
                if(!vis[row][col-1] && grid[row][col-1]=='1'){
                    q.add(new Pair(row,col-1));
                    vis[row][col-1]=true;
                }
            }

            //right ->(row,col+1)
            if((col+1)<n){
                 if(!vis[row][col+1] && grid[row][col+1]=='1'){
                     q.add(new Pair(row,col+1));
                    vis[row][col+1]=true;
                 }
            }
            
        }
    }
    public int numIslands(char[][] grid) {
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        int cnt=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    bfs(i,j,grid,vis);
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
}