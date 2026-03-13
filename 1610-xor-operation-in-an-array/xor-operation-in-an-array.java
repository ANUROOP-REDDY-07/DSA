class Solution {
    public int xorOperation(int n, int start) {
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=start+2*i;
        }
        int ans=res[0];
        for(int i=1;i<n;i++){
            ans=ans^res[i];
        }

        return ans;
    }
}