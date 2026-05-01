class Solution {
    public int maxRotateFunction(int[] nums) {
        
        int n=nums.length;
        int sum=0;
        int prod=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            prod+=i*nums[i];
        }
        int max=prod;

        for(int i=1;i<n;i++){
            prod=prod+sum-(n*nums[n-i]);
            max=Math.max(prod,max);
        }

        return max;
    }
}