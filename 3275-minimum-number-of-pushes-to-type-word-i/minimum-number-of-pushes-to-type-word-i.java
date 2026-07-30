class Solution {
    public int minimumPushes(String word) {
        int length=word.length();
        if(length<=8){
            return length;
        }

        int turn=1;
        int minPush=0;

       while(length>0){
        int val=Math.min(8,length);
        minPush+=turn*val;
        turn++;
        length=length-val;
       }

       return minPush;

    }
}