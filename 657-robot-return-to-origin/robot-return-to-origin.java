class Solution {
    public boolean judgeCircle(String moves) {
        int up=0;
        int down=0;
        int left=0;
        int right=0;

        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U'){
                up++;
            }else if(ch=='D'){
                down++;
            }else if(ch=='L'){
                left++;
            }else{
                right++;
            }

        }
         if(up==down && left==right){
                return true;
            }
    return false;
    }
}