class Solution {
    public int largestAltitude(int[] gain) {
        int res[]=new int[gain.length];
        res[0]=gain[0];
        for(int i=1;i<gain.length;i++){
            res[i]=res[i-1]+gain[i];
        }
        
        int max=Integer.MIN_VALUE;

        for(int i=0;i<res.length;i++){
            max=Math.max(max,res[i]);
        }

        return max>0?max:0;

    }
}