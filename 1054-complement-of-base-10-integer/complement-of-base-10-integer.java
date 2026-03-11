class Solution {
    public int bitwiseComplement(int n) {

        if(n==0) return 1;
        
        int res=0;
        int power=1;
        while(n!=0){
            int bit=n&1;
            int flipped=bit^1;
            res+=flipped*power;
            power=power<<1;
            n=n>>1;
        }
        return res;
    }
}