class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                max=Math.max(max,nums[i]*nums[j]*nums[k]);
                j++;
                k--;
            }
        }
        return max;
    }
}