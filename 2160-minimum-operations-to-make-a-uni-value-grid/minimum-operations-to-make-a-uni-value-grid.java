class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> al=new ArrayList<>();
        int res=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                al.add(grid[i][j]);
            }
        }

        Collections.sort(al);
        int n=al.size();
        int finalCommon=al.get(n/2);

        for(int ele:al){
            if(ele%x != finalCommon%x){
                return -1;
            }

            res+=Math.abs(finalCommon-ele)/x;
        }
        return res;
    }
}