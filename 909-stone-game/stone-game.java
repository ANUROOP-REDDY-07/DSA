class Solution {
    int solve(int[] piles,int i,int j,Integer dp[][]){
        
        if(i>=j){
            return 0;
        }

        if(dp[i][j]!=null){
            return dp[i][j];
        }

        int aliceLeft=piles[i]-solve(piles,i+1,j,dp);
        int aliceRight=piles[j]-solve(piles,i,j-1,dp);
        return dp[i][j]=Math.max(aliceLeft,aliceRight);
    }
    public boolean stoneGame(int[] piles) {
        Integer dp[][]=new Integer[piles.length][piles.length];
        return solve(piles,0,piles.length-1,dp)>0;
    }
}