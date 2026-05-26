class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> lower=new HashSet<>();
        Set<Character> upper=new HashSet<>();

        for(int i=0;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                lower.add(word.charAt(i));
            }else{
                upper.add(word.charAt(i));
            }
        }

        int cnt=0;
        for(char l:upper){
           l=Character.toLowerCase(l);
           if(lower.contains(l)){
            cnt++;
           }
        }
        
        return cnt;
    }
}