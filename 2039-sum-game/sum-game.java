class Solution {
    public boolean sumGame(String num) {
        int n=num.length();

        int leftSum=0;
        int rightSum=0;

        int leftQmark=0;
        int rightQmark=0;

        for(int i=0;i<n;i++){
            if(num.charAt(i)=='?'){
                if(i<n/2){
                    leftQmark++;
                }else{
                    rightQmark++;
                }
            }else{
                if(i<n/2){
                    leftSum+=(num.charAt(i)-'0');
                }else{
                    rightSum+=(num.charAt(i)-'0');
                }
            }
        }


        int totalQmark=leftQmark+rightQmark;
        if(totalQmark%2!=0){
            return true;
        }

        int left=2*leftSum+9*leftQmark;
        int right=2*rightSum+9*rightQmark;

        if(left==right){
            return false;
        }

        return true;
    }
}