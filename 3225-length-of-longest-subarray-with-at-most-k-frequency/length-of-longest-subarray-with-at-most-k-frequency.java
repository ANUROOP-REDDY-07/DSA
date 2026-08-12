class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int i=0;
        int j=0;
        int maxLen=Integer.MIN_VALUE;
        while(j<nums.length){
            freq.put(nums[j],freq.getOrDefault(nums[j],0)+1);

            //invalid
            while(freq.get(nums[j])>k && i<nums.length){
                freq.put(nums[i],freq.get(nums[i])-1);
                i++;
            }

            //valid;
            j++;

            maxLen=Math.max(maxLen,j-i);
           
        }
        return maxLen;

    }
}