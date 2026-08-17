class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int i=0;
        int j=0;
        int maxLen=Integer.MIN_VALUE;
        while(j<s.length()){
            hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)+1);
            while(hm.get(s.charAt(j))>2){
                hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
                i++;
            }
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }

        return maxLen;
    }
}