class Solution {
    long totalsum=0;
    public boolean isHorizontalCut(int[][] grid){
        int m=grid.length;
        int n=grid[0].length;

        
        long top=0;
        Set<Long> s=new HashSet<>();

       

        for(int i=0;i<m-1;i++){
            for(int j=0;j<n;j++){
                top+=grid[i][j];
                s.add((long)grid[i][j]);
            }

        long bottom=totalsum-top;
        long diff=top-bottom;

        if(diff==0) return true;
       
        if(diff==grid[0][0]) return true;
        if(diff==grid[0][n-1]) return true;
        if(diff==grid[i][0]) return true;

        if(i>0 && n>1 && s.contains(diff)) return true;
        
        }

        return false;

    }

    public boolean canPartitionGrid(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                totalsum+=grid[i][j];
            }
        }

        if(isHorizontalCut(grid)){
            return true;  
        }

        //reverse
        int top=0;
        int bottom=m-1;
        while(top<bottom){
            int temp[]=grid[top];
            grid[top]=grid[bottom];
            grid[bottom]=temp;
            top++;
            bottom--;
        }

        if(isHorizontalCut(grid)){
            return true;
        }

        //original
        top=0;
        bottom=m-1;
        while(top<bottom){
            int temp[]=grid[top];
            grid[top]=grid[bottom];
            grid[bottom]=temp;
            top++;
            bottom--;
        }

        //transpose--instead of left and right cut 
        int transpose[][]=new int[n][m];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                transpose[j][i]=grid[i][j];
            }
        }

        if(isHorizontalCut(transpose)){
            return true;
        }

        //reverse
        top=0;
        bottom=transpose.length-1;
        while(top<bottom){
            int temp[]=transpose[top];
            transpose[top]=transpose[bottom];
            transpose[bottom]=temp;
            top++;
            bottom--;
        }

        if(isHorizontalCut(transpose)){
            return true;
        }


        return false;
    }
}