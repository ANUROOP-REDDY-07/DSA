class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length;i++){
            StringBuilder temp=new StringBuilder(str[i]);
            sb.append(temp.reverse());

            if(i!=str.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    
}