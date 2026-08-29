class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int[] temp=Arrays.copyOf(nums,nums.length);
        Arrays.sort(temp);

        Map<Integer,Integer> mp=new HashMap<>();
        int groupCnt=0;
        mp.put(temp[0],groupCnt);

        for(int i=1;i<nums.length;i++){
            if(temp[i]-temp[i-1]>limit){
                groupCnt++;
            }

            mp.put(temp[i],groupCnt);
        }

        Map<Integer,Queue<Integer>> hm=new HashMap<>();
        
        for(int ele:temp){
            int gp=mp.get(ele);
            if(!hm.containsKey(gp)){
                hm.put(gp,new LinkedList<>());
            }
            hm.get(gp).add(ele);
        }

        for(int i=0;i<nums.length;i++){
            int gp=mp.get(nums[i]);
            temp[i]=hm.get(gp).poll();
        }

        return temp;

    }
}