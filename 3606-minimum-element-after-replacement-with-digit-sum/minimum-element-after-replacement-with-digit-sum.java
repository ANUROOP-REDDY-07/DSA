class Solution {
    public int minElement(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int dig=nums[i];
            int sum=0;
            while(dig>0){
                int rem=dig%10;
                sum+=rem;
                dig=dig/10;
            }
            nums[i]=sum;
        }

        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            mini=Math.min(mini,nums[i]);
        }

        return mini;
    }
}