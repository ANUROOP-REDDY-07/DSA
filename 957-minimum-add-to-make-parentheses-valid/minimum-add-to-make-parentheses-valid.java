class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Integer> open=new Stack<>();
        Stack<Integer> close=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open.push(i);
            }else{
                if(!open.isEmpty()){
                    open.pop();
                }else{
                    close.push(i);
                }
            }
        }

        return open.size()+close.size();
    }
}