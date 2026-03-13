class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        int cnt[]=new int[26];
        for(int i=0;i<sentence.length();i++){
            cnt[sentence.charAt(i)-'a']++;
        }
        int sum=0;
         for(int i=0;i<26;i++){
            if(cnt[i]>=1){
                sum+=cnt[i];
            }else{
                return false;
            }
        }

        if(sum>=26){
            return true;
        }
      return false;
    }
}