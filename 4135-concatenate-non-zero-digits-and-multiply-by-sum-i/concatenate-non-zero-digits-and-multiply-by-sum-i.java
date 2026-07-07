class Solution {
    public long sumAndMultiply(int n) {
        if(n==0){
            return 0;
        }
        StringBuilder sb=new StringBuilder();
        long sum=0;
        while(n>0){
            int rem=n%10;
            if(rem!=0) {
                sb.append(rem);
                sum+=rem;
            }
            n=n/10;
        }
       String f=sb.reverse().toString();
       long num=(long)Integer.parseInt(f);
       return num*sum;
    }
}