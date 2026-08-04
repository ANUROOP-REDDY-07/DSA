class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res=new ArrayList<>();
        Set<Integer> s=new HashSet<>();

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
            if(nums[i]<min){
                min=nums[i];
            }

            if(nums[i]>max){
                max=nums[i];
            }
        }

        for(int i=min;i<=max;i++){
            if(!s.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}