class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=Math.min(nums1.length,nums2.length);
        ArrayList<Integer> res=new ArrayList<>();
        Map<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            mp.put(nums1[i],mp.getOrDefault(nums1[i],0)+1);
        }

        for(int i=0;i<nums2.length;i++){
            if(mp.containsKey(nums2[i]) && mp.get(nums2[i])!=0){
                    res.add(nums2[i]);
                    mp.put(nums2[i],mp.get(nums2[i])-1);
            }
        }

        int ans[]=new int[res.size()];
        int idx=0;
        for(int e:res){
            ans[idx++]=e;
        }
      return ans;
    }
}