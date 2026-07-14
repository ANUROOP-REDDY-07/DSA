class Solution {
    int lcs(StringBuilder s1,StringBuilder s2,int i,int j,int dp[][]){

        if(i<0 || j<0){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]= 1+lcs(s1,s2,i-1,j-1,dp);
        }else{
            return dp[i][j]=Math.max(lcs(s1,s2,i,j-1,dp),lcs(s1,s2,i-1,j,dp));
        }
    }
    public int minInsertions(String s) {
        StringBuilder sb=new StringBuilder(s);
        StringBuilder sb2=new StringBuilder(s).reverse();
        int dp[][]=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            Arrays.fill(dp[i],-1);
        }
        int common=lcs(sb,sb2,s.length()-1,s.length()-1,dp);
        //System.out.print(common);
        int changeable=s.length()-common;
        return changeable;
    }
}