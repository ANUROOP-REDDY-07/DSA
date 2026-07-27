class Solution {
    int solve(int[] coins,int amount,int idx,int dp[][]){

        if(idx<0 || amount<0){
            return (int)1e9;
        }

        if(amount==0){
            return 0;
        }

        if(dp[idx][amount]!=-1){
            return dp[idx][amount];
        }
        
        int pick=1+solve(coins,amount-coins[idx],idx,dp);
        int notpick=solve(coins,amount,idx-1,dp);
        return dp[idx][amount]=Math.min(pick,notpick);
    }

    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int[coins.length][amount+1];
        
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        int ans= solve(coins,amount,coins.length-1,dp);
        return ans>=(int)1e9?-1:ans;
    }
}