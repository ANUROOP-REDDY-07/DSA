class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res=new StringBuilder();
        int bal=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(bal>0){
                    res.append(ch);
                }
                bal++;
            }else{
                bal--;
                if(bal>0){
                    res.append(ch);
                }
            }
        }
        return res.toString();
    }
}