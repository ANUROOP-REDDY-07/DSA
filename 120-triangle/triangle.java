class Solution {
    int triangleDp(List<List<Integer>> triangle,int n,int i,int j,Integer[][] dp){
        
        if(i==n-1){
            return triangle.get(i).get(j);  
        }

        if(dp[i][j]!=null) return dp[i][j];

        int left=triangle.get(i).get(j)+triangleDp(triangle,n,i+1,j,dp);
        int right=triangle.get(i).get(j)+triangleDp(triangle,n,i+1,j+1,dp);
        return dp[i][j]=Math.min(left,right);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        Integer dp[][]=new Integer[n][n];

        
        return triangleDp(triangle,n,0,0,dp);
    }
}