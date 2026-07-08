class Solution {

    void solve(int[] candidates, int target,int idx,List<Integer> curr,List<List<Integer>> res){

        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        
        if(idx==candidates.length || target<0){
            return;
        }

        //take
        curr.add(candidates[idx]);
        solve(candidates,target-candidates[idx],idx+1,curr,res);
        curr.remove(curr.size()-1);

        //skip all duplicates
        int next=idx+1;
        while(next<candidates.length && candidates[next]==candidates[idx]){
            next++;
        }
        solve(candidates,target,next,curr,res);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        solve(candidates,target,0,new ArrayList<>(),res);
        return res;
    }
}