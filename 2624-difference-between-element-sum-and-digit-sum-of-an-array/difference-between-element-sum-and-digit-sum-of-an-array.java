class Solution {
    public int differenceOfSum(int[] nums) {
        int ele_sum=0;
        int digit_sum=0;
        for(int i=0;i<nums.length;i++){
                ele_sum+=nums[i];

                if(nums[i]>9){
                    while(nums[i]!=0){
                        digit_sum+=(nums[i]%10);
                        nums[i]=nums[i]/10;
                    }
                }else{
                    digit_sum+=nums[i];
                }
        }
        return Math.abs(ele_sum-digit_sum);
    }
}