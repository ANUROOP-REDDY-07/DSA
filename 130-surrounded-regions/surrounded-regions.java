class Pair{
    int r;
    int c;
    Pair(int row,int col){
        this.r=row;
        this.c=col;
    }
}

class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        boolean vis[][]=new boolean[m][n];

        int dir1[]=new int[]{-1,0,1,0};
        int dir2[]=new int[]{0,1,0,-1};

        Queue<Pair> q=new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O' && (i==0 || j==0 || i==m-1 || j==n-1)){
                    q.add(new Pair(i,j));
                    vis[i][j]=true;
                    board[i][j]='1';
                }
            }
        }

        while(!q.isEmpty()){
            Pair curr=q.remove();
            int row=curr.r;
            int col=curr.c;

            for(int i=0;i<4;i++){
                int nextr=row+dir1[i];
                int nextc=col+dir2[i];

                if(nextr>=0 && nextc>=0 && nextr<m && nextc<n){
                    if(!vis[nextr][nextc] && board[nextr][nextc]=='O'){
                        q.add(new Pair(nextr,nextc));
                        vis[nextr][nextc]=true;
                        board[nextr][nextc]='1';
                    }
                }

            }

        }

         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }

                if(board[i][j]=='1'){
                    board[i][j]='O';
                }
            }
         }

    }
}