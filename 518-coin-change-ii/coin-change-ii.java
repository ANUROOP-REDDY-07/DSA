class Solution {
    // int solve(int amount,int[] coins,int idx,int dp[][]){

    //     if(amount>0 && idx<0){
    //         return 0;
    //     }

    //     if(amount==0){
    //         return 1;
    //     }

    //     if(dp[amount][idx]!=-1){
    //         return dp[amount][idx];
    //     }
    //     //skip;
    //     int skip=solve(amount,coins,idx-1,dp);
    //     int take=0;

    //     //take
    //     if(amount>=coins[idx]){
    //         take=solve(amount-coins[idx],coins,idx,dp);
    //     }
    //     return dp[amount][idx]=skip+take;
    // }

    public int change(int amount, int[] coins) {
        int dp[][]=new int[amount+1][coins.length+1];

        for(int j=0;j<=coins.length;j++){
            dp[0][j]=1;
        }

        //dp[i][j]-> represents number of ways  amount i made using first j coins

        for(int i=1;i<=amount;i++){
            for(int j=1;j<=coins.length;j++){
                
                int skip=dp[i][j-1];
                int take=0;
                if(i>=coins[j-1]){
                    take=dp[i-coins[j-1]][j];
                }
                dp[i][j]=skip+take;
            }
        }
        return dp[amount][coins.length];
    }
}