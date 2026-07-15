class Solution {
    boolean isSafe(int board[][],int row,int col){
        int n=board.length;

        // above col
        for(int i=0;i<row;i++){
            if(board[i][col]==1){
                return false;
            }
        }

        //upper-left
        int r=row;
        int c=col;
        while(r>=0 && c>=0){
            if(board[r][c]==1){
                return false;
            }
            r--;
            c--;
        }

        //upper-right
        r=row;
        c=col;
        while(r>=0 && c<n){
            if(board[r][c]==1){
                return false;
            }
            r--;
            c++;
        }
        
       return true;
    }

    void solve(int[][] board,List<List<String>> res,int row){

        if(row>=board.length){
            //append to res;
            ArrayList<String> l=new ArrayList<>();
            for(int i=0;i<board.length;i++){
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<board.length;j++){
                    if(board[i][j]==1){
                        sb.append('Q');
                    }else{
                        sb.append('.');
                    }
                }
                l.add(sb.toString());
            }
            res.add(l);
            return;
        }

        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
                board[row][i]=1;
                solve(board,res,row+1);
                board[row][i]=0;
            }
        }

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        int board[][]=new int[n][n];
        solve(board,res,0);
        return res;
    }
}