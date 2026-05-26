class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[s.length()];
       
        q.add(0);
        vis[0]=true;
        int far=0;

        while(!q.isEmpty()){
            int st=q.remove();
            if(st==s.length()-1){
                return true;
            }
            int start=Math.max(st+minJump,far+1);
            int end=Math.min(st+maxJump,s.length()-1);
            for(int i=start;i<=end;i++){
                    if(s.charAt(i)=='0' && !vis[i]){
                        q.add(i);
                        vis[i]=true;
                    }
                }
                far=end;
        }

        return false;
    }
}