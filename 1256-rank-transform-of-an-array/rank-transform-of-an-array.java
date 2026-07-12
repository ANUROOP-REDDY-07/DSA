class Solution {
    public int[] arrayRankTransform(int[] arr) {
       Map<Integer,Integer> mp=new HashMap<>();
       int cloneArr[]=arr.clone();
       Arrays.sort(cloneArr);

       int rank=1;
       for(int e:cloneArr){
            if(!mp.containsKey(e)){
                mp.put(e,rank);
                rank++;
            }
       }

       for(int i=0;i<arr.length;i++){
        arr[i]=mp.get(arr[i]);
       } 
    return arr;
    }
}