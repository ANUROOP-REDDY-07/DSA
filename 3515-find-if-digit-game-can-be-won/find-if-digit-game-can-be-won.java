class Solution {
    public boolean canAliceWin(int[] nums) {
        
        int totalsum=0;
        int alice_single=0;
        int alice_double=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9){
                alice_single+=nums[i];
            }else{
                alice_double+=nums[i];
            }
            totalsum+=nums[i];
        }
           
            return (alice_single>(totalsum-alice_single)) || (alice_double>(totalsum-alice_double));
    }
}