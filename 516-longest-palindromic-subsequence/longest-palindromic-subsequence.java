class Solution {
    public int longestPalindromeSubseq(String s) {
        char ch1[]=s.toCharArray();
        StringBuilder sb=new StringBuilder(s).reverse();
        char ch2[]=sb.toString().toCharArray();

        int m=s.length();
        int dp[][]=new int[m+1][m+1];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++){
                if(ch1[i-1]==ch2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[m][m];
    }
}