class Solution {
    public int removeElement(int[] nums, int val) {
        int st=0;
        int end=nums.length-1;
        while(st<=end){
            if(nums[end]==val){
                    end--;
            }
            else if(nums[st]==val){
                int temp=nums[st];
                nums[st]=nums[end];
                nums[end]=temp;
                st++;
                end--;
            }
            else{
                st++;
            }
        continue;
        }

        return end+1;
    }
}