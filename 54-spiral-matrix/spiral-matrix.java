class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> l=new ArrayList<>();

        int m=matrix.length;
        int n=matrix[0].length;

        int strow=0;
        int stcol=0;

        int endrow=m-1;
        int endcol=n-1;

    while(strow<=endrow && stcol<=endcol){

        for(int i=stcol;i<=endcol;i++){
            l.add(matrix[strow][i]);
        }
        strow++;

        for(int j=strow;j<=endrow;j++){
            l.add(matrix[j][endcol]);
        }
        endcol--;

        if(strow<=endrow){
        for(int i=endcol;i>=stcol;i--){
            l.add(matrix[endrow][i]);
        }
        endrow--;
        }

    if(stcol<=endcol){
        for(int j=endrow;j>=strow;j--){
            l.add(matrix[j][stcol]);
            }
            stcol++;
    }

    }
        return l;
        
    }
}