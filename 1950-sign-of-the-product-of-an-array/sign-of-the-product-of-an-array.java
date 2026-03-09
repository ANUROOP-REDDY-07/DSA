class Solution {
    public int arraySign(int[] nums) {
        int negcnt=0;
        boolean isZeroExist=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                negcnt+=1;
            }

            if(nums[i]==0){
                isZeroExist=true;
                return 0;
            }
        }
        if(negcnt%2==0){
            return 1;
        }

        return -1;
    }

}