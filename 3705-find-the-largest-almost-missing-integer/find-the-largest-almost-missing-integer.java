class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int i=0;
        int j=k-1;

        while(j<nums.length){
            HashSet<Integer> set=new HashSet<>();

            for(int t=i;t<=j;t++){
               set.add(nums[t]);
            }

            for(int x:set){
                 hm.put(x,hm.getOrDefault(x,0)+1);
            }
            i++;
            j++;
        }

        int res=-1;
        for(int key:hm.keySet()){
            if(hm.get(key)==1){
                res=Math.max(res,key);
                //System.out.print(key+" "+ res+" ");
            }
        }

        return res;
    }
}