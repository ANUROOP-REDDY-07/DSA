class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> hm =new HashMap<>();
        hm.put(0,1);

        int prefsum=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            prefsum+=nums[i];
            int remove=prefsum-k;
            if(hm.containsKey(remove)){
                cnt+=hm.get(remove);
            }
             hm.put(prefsum,hm.getOrDefault(prefsum,0)+1);
            
        }

        return cnt;
        
    }
}