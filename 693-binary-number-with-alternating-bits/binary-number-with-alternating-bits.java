class Solution {
    public boolean hasAlternatingBits(int n) {
        int prevBit=-1;

        while(n>0){
            int bit=n&1;
            if(prevBit!=-1 && prevBit==bit){
                return false;
            }

            prevBit=bit;

            n=n>>1;

            System.out.println(bit+" "+prevBit+" "+n);
        }
        return true;
    }
}