class Solution {
    public int missingInteger(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }

        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1) sum+=nums[i];
            else break;
        }

        while(hm.containsKey(sum)){
            sum++;
        }

        return sum;
    }
}