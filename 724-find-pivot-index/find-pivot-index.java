class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        prefix[0]=nums[0];

        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }

        int pivot=-1;

        for(int i=0;i<n;i++){
            int leftsum=i==0?0:prefix[i-1];
            int rightsum=prefix[n-1]-leftsum-nums[i];
            if(leftsum==rightsum){
                pivot=i;
                break;
            }
        }

        return pivot;
    }
}