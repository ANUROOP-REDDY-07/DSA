class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length==1){
            return cost[0];
        }
        

        Arrays.sort(cost);
        int i=cost.length-1;
        int j=i-1;
        int total=0;
        while(j>=0){
            total+=cost[i]+cost[j];
            i-=3;
            j-=3;
        }

        while(i>=0){
            total+=cost[i];
            i--;
        }

        return total;
    }
}