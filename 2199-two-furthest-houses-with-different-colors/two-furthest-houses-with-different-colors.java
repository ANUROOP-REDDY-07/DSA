class Solution {
    public int maxDistance(int[] colors) {
        int currDist=0;
        int maxDist=Integer.MIN_VALUE;
        for(int i=0;i<colors.length;i++){
            for(int j=i+1;j<colors.length;j++){
                if(colors[i]!=colors[j]){
                    currDist=j-i;
                    maxDist=Math.max(maxDist,currDist);
                }
            }
        }
        return maxDist;
    }
}