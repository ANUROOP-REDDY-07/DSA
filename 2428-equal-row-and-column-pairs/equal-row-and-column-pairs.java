class Solution {
    public boolean isEqual(int[] arr1,int[] arr2){
        int n=arr1.length;
        for(int i=0;i<n;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public int equalPairs(int[][] grid) {

       int n=grid.length;
       int cnt=0;
        
        HashMap<Integer,int[]> hm=new HashMap<>();

        for(int i=0;i<grid.length;i++){
            int[] temp=new int[grid[0].length];

            for(int j=0;j<n;j++){
                temp[j]=grid[j][i];
            }

            hm.put(i,temp);
        }

        for(int i=0;i<n;i++){
            int search[]=grid[i];

            for(int j=0;j<n;j++){
                if(isEqual(search,hm.get(j))){
                    cnt++;
                }
            }
        }

       return cnt;

        
    }
}