class Solution {
    int m;
    int n;
    Boolean dp[][][];

    boolean helper(char[][] grid,int row,int col,int balance){
        if(balance<0){
            return false;
        }

        if(row==m-1 && col==n-1){
            return balance==0;
        }

        if(dp[row][col][balance]!=null){
            return dp[row][col][balance];
        }

        if(col+1<n){
            int newBal;
            if(grid[row][col+1]=='('){
                newBal=balance+1;
            }else{
                newBal=balance-1;
            }

            if(helper(grid,row,col+1,newBal)){
                return dp[row][col][balance]=true;
            }
        }

        if(row+1<m){
            int newBal;
            if(grid[row+1][col]=='('){
                newBal=balance+1;
            }else{
                newBal=balance-1;
            }

            if(helper(grid,row+1,col,newBal)){
                return dp[row][col][balance]=true;
            }
        }
        return dp[row][col][balance]=false;
    }
    public boolean hasValidPath(char[][] grid) {
        m=grid.length;
        n=grid[0].length;

        if(grid[0][0]!='('){
            return false;
        }

        dp=new Boolean[m][n][m+n];
        return helper(grid,0,0,1);
    }
}