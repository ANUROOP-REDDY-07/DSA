class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxlen=0;
        int currlen=0;
        for(int i:nums){
            if(i==0){
                maxlen=Math.max(currlen,maxlen);
                currlen=0;
            }
            else{
                currlen++;
            }
        }
        maxlen=Math.max(maxlen,currlen);
        return maxlen;
        
    }
}