class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int res[]=new int[nums.length];
        int idx=nums.length-1;
        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                res[idx]=nums[i]*nums[i];
                i++;
                idx--;
            }else{
                res[idx]=nums[j]*nums[j];
                j--;
                idx--;
            }
        }
        return res;
    }
}