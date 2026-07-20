class Solution {
    void reverse(List<Integer> l,int i,int j){
        while(i<j){
            int temp=l.get(i);
            l.set(i,l.get(j));
            l.set(j,temp);
            i++;
            j--;
        }
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int tot=m*n;

        k=k%tot;

        List<Integer> l=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                l.add(grid[i][j]);
            }
        }

        reverse(l,0,tot-1);
        reverse(l,0,k-1);
        reverse(l,k,tot-1);

        List<List<Integer>> res=new ArrayList<>();
        int idx=0;
        for(int i=0;i<m;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(l.get(idx++));
            }
            res.add(row);
        }

        return res;

    }
}