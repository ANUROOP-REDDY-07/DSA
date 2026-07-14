class Solution {

    public void solve(int low,int high,int i,int val,List<Integer> res){
        
        
        if(val>=low && val<=high){
            res.add(val);
        }

        if(i>9){
            return;
        }

        val=(val*10)+i;
         if(val>high){
            return;
        }
        solve(low,high,i+1,val,res);
        return;
    }
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res=new ArrayList<>();

        for(int i=1;i<=9;i++){
            solve(low,high,i,0,res);
        }
        Collections.sort(res);
        return res;
    }
}