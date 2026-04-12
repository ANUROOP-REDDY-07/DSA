class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            max=Math.max(candies[i],max);
        }

        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                res.add(i,true);
            }else{
                res.add(i,false);
            }
        }
        return res;
    }
}