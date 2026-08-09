class Solution {
    int solve(int[] piles,int player,int idx,int m,int dp[][][] ){
        if(idx>=piles.length){
            return 0;
        }

        if(dp[player][idx][m]!=-1){
            return dp[player][idx][m];
        }

        int result=(player==1)?-1:Integer.MAX_VALUE;
        int stones=0;
        for(int x=1;x<=Math.min(2*m,piles.length-idx);x++){
            stones+=piles[idx+x-1];
            if(player==1){
                result=Math.max(result,stones+solve(piles,0,idx+x,Math.max(m,x),dp));
            }else{
                result=Math.min(result,solve(piles,1,idx+x,Math.max(m,x),dp));
            }
        }
        return dp[player][idx][m]=result;
    }
    public int stoneGameII(int[] piles) {
        int n=piles.length;
        int dp[][][]=new int[2][n+1][n+1];
        for(int i=0;i<2;i++){
            for(int j=0;j<n+1;j++){
                for(int k=0;k<n+1;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return solve(piles,1,0,1,dp);
    }
}