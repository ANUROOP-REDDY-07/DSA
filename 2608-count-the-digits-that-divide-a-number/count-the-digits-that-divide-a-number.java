class Solution {
    public int countDigits(int num) {
        int inp=num;
        int cnt=0;
        while(num>0){
            int rem=num%10;
            if(inp%rem==0){
                cnt++;
            }
            num=num/10;
        }
        return cnt;
    }
}