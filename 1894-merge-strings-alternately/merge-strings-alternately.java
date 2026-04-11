class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] ch1=word1.toCharArray();
        char[] ch2=word2.toCharArray();

        StringBuilder sb=new StringBuilder();

        int maxlen=Math.max(ch1.length,ch2.length);
        for(int i=0;i<maxlen;i++){
            if(i<ch1.length){
                sb.append(ch1[i]);
            }

            if(i<ch2.length){
                sb.append(ch2[i]);
            }
        }
        return sb.toString();
    }
}