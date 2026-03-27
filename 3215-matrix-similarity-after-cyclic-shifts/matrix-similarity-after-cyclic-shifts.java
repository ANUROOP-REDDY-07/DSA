class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;

        k=k%n;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i%m==0){
                    if(mat[i][j]!=mat[i][(j+n+k)%n]) return false;
                }else{
                     if(mat[i][j]!=mat[i][(j+n-k)%n]) return false;
                }
            }
        }
        return true;
    }
}