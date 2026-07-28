class Solution {
    // boolean solve(int[] nums,int idx,int target,Boolean dp[][]){

    //     if(target==0){
    //         return true;
    //     }

    //     if(idx==nums.length || target<0){
    //         return false; 
    //     }

    //     if(dp[idx][target]!= null){
    //         return dp[idx][target];
    //     }

    //     boolean skip=solve(nums,idx+1,target,dp);
    //     boolean take=false;

    //     if(nums[idx]<=target){
    //         take=solve(nums,idx+1,target-nums[idx],dp);
    //     }

    //     return dp[idx][target]=skip || take;


    // }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        if(sum%2!=0){
            return false;
        }
        sum/=2;

        boolean dp[][]=new boolean[nums.length+1][sum+1];

        dp[nums.length][0]=true;

        for(int i=nums.length-1;i>=0;i--){
            for(int j=0;j<=sum;j++){
                boolean skip=dp[i+1][j];
                boolean take=false;
                if(nums[i]<=j){
                    take=dp[i+1][j-nums[i]];
                }
                dp[i][j]=skip || take;
            }
        }

        return dp[0][sum];
    }
}