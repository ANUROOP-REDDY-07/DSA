class Solution {
    boolean solve(int[] nums,int idx,int target,Boolean dp[][]){

        if(target==0){
            return true;
        }

        if(idx==nums.length || target<0){
            return false; 
        }

        if(dp[idx][target]!= null){
            return dp[idx][target];
        }

        boolean skip=solve(nums,idx+1,target,dp);
        boolean take=false;

        if(nums[idx]<=target){
            take=solve(nums,idx+1,target-nums[idx],dp);
        }

        return dp[idx][target]=skip || take;


    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        if(sum%2!=0){
            return false;
        }
        sum/=2;
        Boolean dp[][]=new Boolean[nums.length][sum+1];
        return solve(nums,0,sum,dp);
    }
}