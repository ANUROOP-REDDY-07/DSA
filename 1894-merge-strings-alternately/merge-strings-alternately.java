class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        int i=0;

        String res="";

        while(i<n1 && i<n2){
            res+=(word1.charAt(i));
            res+=(word2.charAt(i));
            i++;
        }



        while(i<n1){
            res+=word1.charAt(i);
            i++;
        }

        while(i<n2){
            res+=word2.charAt(i);
            i++;
        }


        return res;
    }
}