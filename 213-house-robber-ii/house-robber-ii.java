class Solution {
    int dpApp(int[] nums,int[] dp,int stidx,int endIdx){
            if(stidx>endIdx){
                return 0;
            }

            if(dp[stidx]!=-1) return dp[stidx];

            int loot=nums[stidx]+dpApp(nums,dp,stidx+2,endIdx);
            int noloot=dpApp(nums,dp,stidx+1,endIdx);
            return dp[stidx]=Math.max(loot,noloot);
    }

    public int rob(int[] nums) {
        int n=nums.length;

        if(n==1){
            return nums[0];
        }
        int dp1[]=new int[n];
        int dp2[]=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        //from to
        int oneInc=dpApp(nums,dp1,0,n-2);
       
        int oneExc=dpApp(nums,dp2,1,n-1);
       
        return Math.max(oneInc,oneExc);
    }
}