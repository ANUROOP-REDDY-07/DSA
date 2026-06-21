class Solution {
    int res=0;
    public int uniquePaths(int m,int n,int currRow,int currCol,int[][] dp){

        if(currRow>=m || currCol>=n){
            return 0;
        }

        if(currRow==m-1 && currCol==n-1){
           return 1;
        }

        if(dp[currRow][currCol]!=0) return dp[currRow][currCol];

        int rightCnt=uniquePaths(m,n,currRow,currCol+1,dp);
        int downCnt=uniquePaths(m,n,currRow+1,currCol,dp);

        return dp[currRow][currCol]=rightCnt+downCnt;

    }

    public int uniquePaths(int m, int n) {
        if(m==1 || n==1){
            return 1;
        }
        int dp[][]=new int[m][n];
        uniquePaths(m,n,0,0,dp);
        return dp[0][0];
        
    }
}