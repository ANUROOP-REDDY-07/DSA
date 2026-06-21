class Solution {
    int minSum(int[][] grid,int m,int n,int i,int j,int dp[][]){

        if(i>=m || j>=n){
            return Integer.MAX_VALUE;
        }

        if(i==m-1 && j==n-1){
            return grid[i][j];
        }

        if(dp[i][j]!=-1) return dp[i][j];
        
       return dp[i][j]=grid[i][j]+Math.min(minSum(grid,m,n,i,j+1,dp),minSum(grid,m,n,i+1,j,dp));
       

    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        if(m==1 && n==1){
            return grid[0][0];
        }

        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return minSum(grid,m,n,0,0,dp);
    }
}