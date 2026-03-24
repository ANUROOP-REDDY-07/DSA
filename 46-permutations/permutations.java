class Solution {
    public void recApp(int[] nums,List<List<Integer>> res,List<Integer> temp,boolean used[]){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){
        
        if(used[i]) continue;

        used[i]=true;
        temp.add(nums[i]);
        recApp(nums,res,temp,used);
        temp.remove(temp.size()-1);
        used[i]=false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        recApp(nums,res,new ArrayList<>(),new boolean[nums.length]);
        return res;
    }
}