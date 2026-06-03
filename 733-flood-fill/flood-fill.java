class Pair{
    int sr;
    int sc;
    Pair(int sr,int sc){
        this.sr=sr;
        this.sc=sc;
    }
}

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        boolean[][] vis=new boolean[m][n];


        int original=image[sr][sc];

        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(sr,sc));

        while(!q.isEmpty()){
            Pair curr=q.remove();
            int i=curr.sr;
            int j=curr.sc;
           // System.out.print(i+" "+j);
            image[i][j]=color;
            

            if(!vis[i][j]){
                vis[i][j]=true;
                //top
                if(i-1>=0 && image[i-1][j]==original){
                    q.add(new Pair(i-1,j));
                }
                //left
                if(j-1>=0 && image[i][j-1]==original){
                    q.add(new Pair(i,j-1));
                }
                //right
                if(j+1<n && image[i][j+1]==original){
                    q.add(new Pair(i,j+1));
                }
                //down
                if(i+1<m && image[i+1][j]==original){
                    q.add(new Pair(i+1,j));
                }       
            }
        }

        return image;
    }
}