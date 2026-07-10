class Solution {

    public int solve(StringBuilder s1,StringBuilder s2,int n1,int n2,int dp[][]){
        if(n1<0 || n2<0){
            return 0;
        }

        if(dp[n1][n2]!=-1){
            return dp[n1][n2];
        }

        if(s1.charAt(n1)==s2.charAt(n2)){
           return dp[n1][n2]= 1+solve(s1,s2,n1-1,n2-1,dp);
        }else{
            return dp[n1][n2]=Math.max(solve(s1,s2,n1-1,n2,dp),solve(s1,s2,n1,n2-1,dp));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        StringBuilder s1=new StringBuilder(text1);
        StringBuilder s2=new StringBuilder(text2);
        int l1=s1.length()-1;
        int l2=s2.length()-1;
        int dp[][]=new int[l1+1][l2+1];

        for(int i=0;i<=l1;i++){
           Arrays.fill(dp[i],-1);
        }
       return solve(s1,s2,l1,l2,dp);
    }
}