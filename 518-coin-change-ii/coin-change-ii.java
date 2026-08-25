class Solution {
    int solve(int amount,int[] coins,int idx,int dp[][]){

        if(amount>0 && idx<0){
            return 0;
        }

        if(amount==0){
            return 1;
        }

        if(dp[amount][idx]!=-1){
            return dp[amount][idx];
        }
        //skip;
        int skip=solve(amount,coins,idx-1,dp);
        int take=0;

        //take
        if(amount>=coins[idx]){
            take=solve(amount-coins[idx],coins,idx,dp);
        }
        return dp[amount][idx]=skip+take;
    }
    public int change(int amount, int[] coins) {
        int dp[][]=new int[amount+1][coins.length];

        for(int i=0;i<=amount;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(amount,coins,coins.length-1,dp);
    }
}