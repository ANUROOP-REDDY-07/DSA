class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,HashSet<Integer>> hm=new HashMap<>();

        for(int i=0;i<reservedSeats.length;i++){
            if(!hm.containsKey(reservedSeats[i][0])){
                hm.put(reservedSeats[i][0],new HashSet<>());
            }
            hm.get(reservedSeats[i][0]).add(reservedSeats[i][1]);
        }

        int res=(n-hm.size())*2;
        
        for(HashSet<Integer> temp:hm.values()){

           boolean grpA=!temp.contains(2) && !temp.contains(3) && !temp.contains(4) && !temp.contains(5);
           boolean grpB=!temp.contains(4) && !temp.contains(5) && !temp.contains(6) && !temp.contains(7);
           boolean grpC=!temp.contains(6) && !temp.contains(7) && !temp.contains(8) && !temp.contains(9);

           if(grpA && grpC){
                res+=2;
           }else if(grpA || grpB || grpC){
                res+=1;
           }
        }
        
        return res;
    }
}