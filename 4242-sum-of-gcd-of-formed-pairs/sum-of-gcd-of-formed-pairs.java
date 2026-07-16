class Solution {
    int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

   
    
    public long gcdSum(int[] nums) {
        int mod=1000000007;
        int n=nums.length;
        
        int mx=0;

        int prefixGcd[]=new int[n];
        for(int i=0;i<n;i++){
            mx=Math.max(mx,nums[i]);
            prefixGcd[i]=gcd(nums[i],mx);
        }
        Arrays.sort(prefixGcd);

        long sum=0;
        for(int i=0;i<n/2;i++){
            int small=prefixGcd[i];
            int large=prefixGcd[n-i-1];
            sum+=gcd(small,large);
        }

        return sum;
    }
}