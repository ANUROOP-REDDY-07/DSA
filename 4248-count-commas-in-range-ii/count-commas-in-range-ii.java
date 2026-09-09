class Solution {
    public long countCommas(long n) {
        long tot=0;
        long start=1000;
        long commas=1;

        while(start<=n){
            long end=start*1000-1;
            long upper=Math.min(n,end);
            tot+=(upper-start+1)*commas;
            start*=1000;
            commas++;
        }
    return tot;
    }
}