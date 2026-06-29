class Solution {
    public boolean hasSubString(String word,String sub){
        
        for(int i=0;i<=word.length()-sub.length();i++){
            int j=0;
            while(j<sub.length() && word.charAt(i+j)==sub.charAt(j)){
                j++;
            }

            if(j==sub.length()){
                return true;
            }
        }
        return false;
    }
    public int numOfStrings(String[] patterns, String word) {
        int cnt=0;
        for(int i=0;i<patterns.length;i++){
            String curr=patterns[i];
            if(hasSubString(word,curr)){
                cnt++;
            }
        }
        return cnt;
    }
}