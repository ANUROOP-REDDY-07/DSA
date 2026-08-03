class Solution {
    int solve(int stoneValue[],int i,int n,Integer dp[]){
        if(i>=n){
            return 0;
        }

        if(dp[i]!=null){
            return dp[i];
        }

        int one=stoneValue[i]-solve(stoneValue,i+1,n,dp);
        int two=Integer.MIN_VALUE;
        int three=Integer.MIN_VALUE;
        if(i+1<n){
        two=(stoneValue[i]+stoneValue[i+1])-solve(stoneValue,i+2,n,dp);
        }

        if(i+2<n){
        three=(stoneValue[i]+stoneValue[i+1]+stoneValue[i+2])-solve(stoneValue,i+3,n,dp);
        }

        return dp[i]=Math.max(one,Math.max(two,three));
    }
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        Integer dp[]=new Integer[n];
        int res=solve(stoneValue,0,n,dp);
        if(res==0){
            return "Tie";
        }else if(res>0){
            return "Alice";
        }else{
            return "Bob";
        }
    }
}