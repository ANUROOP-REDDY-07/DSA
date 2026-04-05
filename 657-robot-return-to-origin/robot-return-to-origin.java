class Solution {
    public boolean judgeCircle(String moves) {
        int[] arr=new int[26];
        for(char ch:moves.toCharArray()){
            arr[ch-'A']++;
        }

        return arr['U'-'A']==arr['D'-'A'] &&
                    arr['L'-'A']==arr['R'-'A'];
    }
}