class Solution {
    public int totalWaviness(int num1, int num2) {
        int totalPeak=0;
        int totalValley=0;
        
        for(int i=num1;i<num2+1;i++){
            String s=Integer.toString(i);
            if(s.length()<3){
                continue;
            }

            for(int j=1;j<s.length()-1;j++){
                if(s.charAt(j)>s.charAt(j+1) && s.charAt(j)>s.charAt(j-1)){
                    totalPeak+=1;
                }
                if(s.charAt(j)<s.charAt(j+1) && s.charAt(j)<s.charAt(j-1)){
                    totalValley+=1;
                }
            }
        }
        return totalPeak+totalValley;
    }
}