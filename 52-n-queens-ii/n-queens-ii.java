class Solution {
    int cnt=0;
    boolean isSafe(int[][] board,int row,int col){
        int n=board.length;

        for(int i=0;i<row;i++){
            if(board[i][col]==1){
                return false;
            }
        }

        int r=row;
        int c=col;
        while(r>=0 && c>=0){
            if(board[r][c]==1){
                return false;
            }
            r--;c--;
        }

        r=row;
        c=col;
        while(r>=0 && c<n){
            if(board[r][c]==1){
                return false;
            }
            r--;c++;
        }

        return true;
    }

    void solve(int board[][],int row){

        if(row==board.length){
            cnt++;
            return;
        }

        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=1;
                solve(board,row+1);
                board[row][col]=0;
            }
        }
    }
    
    public int totalNQueens(int n) {
        int board[][]=new int[n][n];
        solve(board,0);
        return cnt;
    }
}