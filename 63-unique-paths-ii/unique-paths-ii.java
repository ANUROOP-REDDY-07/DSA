class Solution {
    int numberOfPaths(int[][] obstacleGrid,int row,int col,int dp[][]){

        if(row<0 || col<0 || row>=obstacleGrid.length || col>=obstacleGrid[0].length){
            return 0;
        }

        if(obstacleGrid[row][col]==1){
            return 0;
        }

        
        if(row==obstacleGrid.length-1 && col==obstacleGrid[0].length-1){
            return 1;
        }

        if(dp[row][col]!=-1){
            return dp[row][col];
        }

        int right=numberOfPaths(obstacleGrid,row,col+1,dp);
        int down=numberOfPaths(obstacleGrid,row+1,col,dp);

        return dp[row][col]=right+down;
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int cnt=0;
        int dp[][]=new int[obstacleGrid.length][obstacleGrid[0].length];

        for(int i=0;i<obstacleGrid.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return numberOfPaths(obstacleGrid,0,0,dp);   
    }
}