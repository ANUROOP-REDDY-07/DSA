class Solution {
    public int furthestDistanceFromOrigin(String moves) {

        int cntL=0;
        int cntR=0;
        int cntB=0;

        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                cntL++;
            }else if(moves.charAt(i)=='R'){
                cntR++;
            }else{
                cntB++;
            }
        }

        return Math.abs(cntL-cntR)+cntB;
    }
}