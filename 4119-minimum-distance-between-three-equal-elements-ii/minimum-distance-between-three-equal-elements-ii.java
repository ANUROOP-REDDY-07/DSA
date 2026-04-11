class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer,ArrayList<Integer>> hm=new HashMap<>();
        int ans=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                ArrayList<Integer> temp=hm.get(nums[i]);
                temp.add(i);

                if(temp.size()>=3){
                    
                    int n=temp.size();
                    int a=temp.get(n-3);
                    int b=temp.get(n-2);
                    int c=temp.get(n-1);
                    int dist=Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a);
                    ans=Math.min(ans,dist);
                }
            }else{
                ArrayList<Integer> l=new ArrayList<>();
                l.add(i);
                hm.put(nums[i],l);
            }
        } 
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}