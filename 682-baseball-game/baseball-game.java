class Solution {
    public int calPoints(String[] operations) {
        int totalsum=0;
        int arr[]=new int[operations.length];
        int idx=0;
        for(int i=0;i<operations.length;i++){
            String s=operations[i];
            
            if(s.equals("+")){
                arr[idx]=arr[idx-1]+arr[idx-2];
                idx++;
            }else if(s.equals("D")){
                arr[idx]=2*arr[idx-1];
                idx++;
            }else if(s.equals("C")){
                arr[idx-1]=0;
                idx--;
            }else{
                arr[idx]=Integer.parseInt(s);
                idx++;
            }
    }
    for(int i=0;i<arr.length;i++){
        totalsum+=arr[i];
    }
    return totalsum;
    }
}