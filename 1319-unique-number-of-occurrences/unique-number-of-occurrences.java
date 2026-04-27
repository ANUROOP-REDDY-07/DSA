class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
                hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

        for(int v:hm.values()){
            if(set.contains(v)){
                return false;
            }
            set.add(v);
        }

        return true;

    }
}