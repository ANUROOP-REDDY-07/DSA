class Solution {
    
    int solve(int nums[],int target,int idx,int currSum){

        if(currSum==target && idx==nums.length){
            return 1;
        }

        if(idx==nums.length){
            return 0;
        }


                 //positive                                       
        return solve(nums,target,idx+1,currSum+nums[idx])+
        solve(nums,target,idx+1,currSum-nums[idx]); //negative
        
    }
    
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,target,0,0);
    }
}