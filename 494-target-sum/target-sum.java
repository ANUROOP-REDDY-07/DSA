class Solution {
    
    int solve(int nums[],int target,int idx,int currSum,int dp[][],int sum){
        
        if(idx==nums.length){
           return currSum==target?1:0;
        }

       
        if(dp[idx][currSum+sum]!=-1){
            return dp[idx][currSum+sum];
        }

                 //positive                                       
        return dp[idx][currSum+sum]=solve(nums,target,idx+1,currSum+nums[idx],dp,sum)+
        solve(nums,target,idx+1,currSum-nums[idx],dp,sum); //negative
        
    }

    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int dp[][]=new int[nums.length][2*sum+1];

        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(nums,target,0,0,dp,sum);
    }
}