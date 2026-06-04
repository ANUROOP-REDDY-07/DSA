

class Solution {
    public void dfs(int[][] grid,boolean[][] vis,int row,int col){  
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length) return ;
        if(vis[row][col] || grid[row][col]==0) return;

        grid[row][col]=2;
        vis[row][col]=true;
        dfs(grid,vis,row-1,col);
        dfs(grid,vis,row,col+1);
        dfs(grid,vis,row+1,col);
        dfs(grid,vis,row,col-1);
    }

    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        boolean vis[][]=new boolean[m][n];
       
        for(int i=0;i<m;i++){   
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 &&(i==0 || j==0 ||i==m-1 || j==n-1)){
                    dfs(grid,vis,i,j);
                }
            }
        }

        int cnt=0;
        for(int i=0;i<m;i++){    
         for(int j=0;j<n;j++){
            if(grid[i][j]==1){
                cnt++;
               }
            }
        }
        return cnt;
    }
}