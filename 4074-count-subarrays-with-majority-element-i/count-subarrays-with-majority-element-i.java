class Solution {
    public int anotherMethod(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                nums[i]=1;
            }else{
            nums[i]=0;
            }
        }

        int res[]=new int[nums.length];
        res[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            res[i]=res[i-1]+nums[i];
            
        }

        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int twos=(i==0)?res[j]:res[j]-res[i-1];
                if(twos>(j-i+1)/2){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    // boolean findLength(int[] nums,int st,int end,int target){
    //     int targetCnt=0;
    //     int length=(end-st+1)/2;
    //     for(int i=st;i<=end;i++){
    //         if(nums[i]==target){
    //             targetCnt++;
    //         }
    //     }
    //     return targetCnt>length;
//}
    public int countMajoritySubarrays(int[] nums, int target) {
        // int cnt=0;
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         //subarray-> i to j;
        //         if(findLength(nums,i,j,target)){     //0(n^3)
        //             System.out.print(i+" "+j);
        //             cnt++;
        //         }
        //     }
        // }
        // return cnt;

        return anotherMethod(nums,target);

    }
}