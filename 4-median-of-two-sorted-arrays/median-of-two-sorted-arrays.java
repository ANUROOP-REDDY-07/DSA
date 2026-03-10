class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int total=m+n;
        int i=0;
        int j=0;
        int arr[]=new int[m+n];
        int idx=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[idx]=nums1[i];
                idx++;
                i++;
            }else{
                arr[idx]=nums2[j];
                idx++;
                j++;
            } 
        }
        
        while(i<m){
            arr[idx]=nums1[i];
            idx++;
            i++;
        }
        while(j<n){
            arr[idx]=nums2[j];
            idx++;
            j++;
        }
       
       if(total%2!=0){
            return (double) arr[total/2];
       }else{
            return (arr[total/2]+arr[(total/2)-1])/2.0;
       }
    }
}