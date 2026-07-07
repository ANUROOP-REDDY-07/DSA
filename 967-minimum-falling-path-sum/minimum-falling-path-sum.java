class Solution {
    int minPathDp(int[][] matrix,int n,int i,int j,int[][] dp){

        if(i<0 || i>=n || j<0 || j>=n){
            return (int)1e9;
        }

        if(i==n-1){
            return matrix[i][j];
        }

        if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];
        
        int curr=matrix[i][j];

        int a=curr+minPathDp(matrix,n,i+1,j-1,dp);
        int b=curr+minPathDp(matrix,n,i+1,j,dp);
        int c=curr+minPathDp(matrix,n,i+1,j+1,dp);

        return dp[i][j]=Math.min(a,Math.min(b,c));

    }
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int ans=Integer.MAX_VALUE;

        int dp[][]=new int[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }

        int itr[]=matrix[0];
        for(int i=0;i<itr.length;i++){
           ans=Math.min(ans,minPathDp(matrix,n,0,i,dp));
           System.out.print(ans+" ");
        }
        return ans;
    }
}