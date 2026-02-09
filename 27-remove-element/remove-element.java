class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int n=nums.length;
        int arr[]=new int[n];

        if(n==0){return 0;}

        for(int i=0;i<n;i++){
            if(nums[i]==val){continue;
            }else{
                arr[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            nums[i]=arr[i];
        }
        return k;
    }
}