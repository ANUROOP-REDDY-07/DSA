class Solution {
    public String reverseWords(String s) {
        
        int i=s.length()-1;
        StringBuilder sb=new StringBuilder();
        StringBuilder res=new StringBuilder();

        while(i>=0){
            if(s.charAt(i)==' ' && sb.length()==0){
                i--;
            }else if(s.charAt(i)==' '){
                res.append(new StringBuilder(sb).reverse()).append(" ");
                 sb.setLength(0);
                 i--;
            }else{
                sb.append(s.charAt(i));
                i--;
               
            }
            
        }
        res.append(new StringBuilder(sb.reverse()));
        return res.toString().trim();
    }
}