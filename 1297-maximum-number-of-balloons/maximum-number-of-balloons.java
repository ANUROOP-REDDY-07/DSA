class Solution {
    public int maxNumberOfBalloons(String text) {
        int arr[]=new int[5];

        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch=='a'){
                arr[0]+=1;
            }else if(ch=='b'){
                arr[1]+=1;
            }else if(ch=='l'){
                arr[2]+=1;
            }else if(ch=='o'){
                arr[3]+=1;
            }else if(ch=='n'){
                arr[4]+=1;
            }else{
                continue;
            }
        }

        arr[2]=arr[2]/2;
        arr[3]=arr[3]/2;

        int min=arr[0];
        for(int i=1;i<5;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        return min;
    }
}