class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        Map<Integer,Integer> hm=new TreeMap<>(); 

        for(int i=0;i<n;i++){
            int ch=s.charAt(i)-'a';
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else{
                hm.put(ch,1);
            }
        }
        
        char ch[]=new char[n];
        int i=0;
        int j=n-1;
        
        for(int key:hm.keySet()){
           int freq=hm.get(key);
           while(freq>0){
                if(freq==1){
                    ch[(i+j)/2]=(char)(key+'a');
                    freq-=1;
                }else{
                    ch[i]=(char)(key+'a');
                    ch[j]=(char)(key+'a');
                    freq-=2;

                    i++;
                    j--;
                }
                
           }
        }
        
        return new String(ch);
    }
}