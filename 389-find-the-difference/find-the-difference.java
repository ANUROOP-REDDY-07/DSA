class Solution {
    public char findTheDifference(String s, String t) {
        char res=0;
        for(int i=0;i<s.length();i++){
            res^=s.charAt(i)^t.charAt(i);
        }

        res^=t.charAt(t.length()-1);
        return res;
        
        // int cnt[]=new int[26];
        // char res=' ';
        // for(int i=0;i<s.length();i++){
        //     cnt[s.charAt(i)-'a']++;
        //     cnt[t.charAt(i)-'a']--;
        // }

        // cnt[t.charAt(t.length()-1)-'a']--;

        // for(int i=0;i<26;i++){
        //     if(cnt[i]==-1){
        //         res=(char)('a'+i);
        //         break;
        //     }
        // }
        // return res;
    }
}