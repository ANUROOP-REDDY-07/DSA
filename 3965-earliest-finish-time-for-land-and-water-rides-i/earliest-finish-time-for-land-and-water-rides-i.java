class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans=Integer.MAX_VALUE;

        int minLandTime=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            minLandTime=Math.min(minLandTime,landStartTime[i]+landDuration[i]);
        }

        for(int i=0;i<waterStartTime.length;i++){
            int Completion=Math.max(minLandTime,waterStartTime[i])+waterDuration[i];
            ans=Math.min(ans,Completion);
        }

        int minWaterTime=Integer.MAX_VALUE;
        for(int i=0;i<waterStartTime.length;i++){
            minWaterTime=Math.min(minWaterTime,waterStartTime[i]+waterDuration[i]);
        }

        for(int i=0;i<landStartTime.length;i++){
            int completion=Math.max(minWaterTime,landStartTime[i])+landDuration[i];
            ans=Math.min(ans,completion);
        }
        return ans;
    }
}