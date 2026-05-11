class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
           String s=Integer.toString(nums[i]);
           for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                int dig=ch-'0';
                al.add(dig);
           }
        }

        int res[]=new int[al.size()];
        for(int i=0;i<al.size();i++){
            res[i]=al.get(i);
        }

        return res;
    }
}