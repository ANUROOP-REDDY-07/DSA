class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int q=queries.length;
        long MOD=1000000007;
        for(int i=0;i<q;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            while(l<=r){
                nums[l]=(int)((nums[l]*1L*queries[i][3])%MOD);
                l+=queries[i][2];
            }
        }
        
        int xor=nums[0];
        for(int i=1;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}