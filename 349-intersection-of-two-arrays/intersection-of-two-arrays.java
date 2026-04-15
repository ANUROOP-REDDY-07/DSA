class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n=nums1.length;
        int m=nums2.length;
        int i=0;
        int j=0;

        Set<Integer> intsc=new HashSet<>();

        while(i<n && j<m){
            if(nums1[i]==nums2[j]){
                intsc.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }

        int k=intsc.size();
        int res[]=new int[k];
        int idx=0;
        for(int ele:intsc){
            res[idx++]=ele;
        }

        return res;

    }
}