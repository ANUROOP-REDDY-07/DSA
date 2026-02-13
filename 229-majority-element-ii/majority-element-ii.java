class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l= new ArrayList<>();
        Map<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){        
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);      
        }

        int cnt=nums.length/3;

        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])>cnt){
                if(!l.contains(nums[i])){
                l.add(nums[i]);
                }
            }
        }
        return l;
    }
}