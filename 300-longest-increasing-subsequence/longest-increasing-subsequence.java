class Solution {
    int solve(int[] nums,int idx,int lastIdx,int dp[][]){

        if(idx==nums.length){
           return 0;
        }

        if(dp[idx][lastIdx+1]!=-1){
            return dp[idx][lastIdx+1];
        }
        //pick
        int pick=-1;
        if(lastIdx==-1 || nums[idx]>nums[lastIdx]){
            pick=1+solve(nums,idx+1,idx,dp);
        }
         //skip
        int skip=solve(nums,idx+1,lastIdx,dp);

        return dp[idx][lastIdx+1]=Math.max(pick,skip);
    }
    public int lengthOfLIS(int[] nums) {
        int dp[][]=new int[nums.length][nums.length+1];
        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(nums,0,-1,dp);
        
    }
}