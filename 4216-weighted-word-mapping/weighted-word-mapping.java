class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int w=0;
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                w+=weights[ch-'a'];
            }
                w=w%26;
                w=25-w;  
                res.append((char)(w+'a'));
        }
        return res.toString();
    }
}