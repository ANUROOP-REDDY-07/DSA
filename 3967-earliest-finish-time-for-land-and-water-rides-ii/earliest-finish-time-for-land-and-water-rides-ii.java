class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans=Integer.MAX_VALUE;
        
        //min possible completion of landride
        int minland=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            minland=Math.min(minland,landStartTime[i]+landDuration[i]);
        }
      

        //find min waterride for obtained landride
        for(int i=0;i<waterStartTime.length;i++){
            int temp=Math.max(minland,waterStartTime[i])+waterDuration[i];
            ans=Math.min(temp,ans);
        }
        



        //min possible completion of waterride
        int minwater=Integer.MAX_VALUE;
        for(int i=0;i<waterStartTime.length;i++){
            minwater=Math.min(minwater,waterStartTime[i]+waterDuration[i]);
        }
        

        //find min landride for obtained waterride
        for(int i=0;i<landStartTime.length;i++){
            int temp=Math.max(minwater,landStartTime[i])+landDuration[i];
            ans=Math.min(temp,ans);
        }

        return ans;
    }
}