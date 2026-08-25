class Solution {
    public int missingMultiple(int[] nums, int k) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }

        for(int i=1;;i++){
            int t=k*i;
            if(hm.containsKey(t)){
                continue;
            }

            return t;
        }

     
    }
}