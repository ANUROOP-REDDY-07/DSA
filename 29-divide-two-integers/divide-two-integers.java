class Solution {
    public int divide(int dividend, int divisor) {
        long a=(long)dividend;
        long b=(long)divisor;

        boolean isNeg=(a<0)^(b<0);

        a=Math.abs(a);
        b=Math.abs(b);

        long quotient=0;

        while(a>=b){
            long currDiv=b;
            long multi=1;

            while(a>=currDiv+currDiv){
                currDiv+=currDiv;
                multi+=multi;
            }
            a-=currDiv;
            quotient+=multi;
        }

        if(isNeg){
            quotient=-quotient;
        }

        if(quotient>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }

        if(quotient<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        return (int)quotient;

    }
}