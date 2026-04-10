class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer,ArrayList<Integer>> mp=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.get(nums[i]).add(i);
            }else{
                ArrayList<Integer> list=new ArrayList<>();
                list.add(i);
                mp.put(nums[i],list);
            }
        }

        int ans=Integer.MAX_VALUE;
        for(int key:mp.keySet()){
            ArrayList<Integer> l=mp.get(key);
            if(l.size()>=3){
                for(int i=0;i<=l.size()-3;i++){
                        int a=l.get(i);
                        int b=l.get(i+1);
                        int c=l.get(i+2);

                        int dist=Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a);
                        ans=Math.min(ans,dist);
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}