class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int oddcnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddcnt+=1;
            }else{
                oddcnt=0;
            }

            if(oddcnt==3){
                return true;
            }
            
        }
        return false;
    }
}