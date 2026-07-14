class Solution {
    int mod=1000000007;
    public int gcd(int a ,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    
    public int solve(int nums[],int idx,int gcd1,int gcd2,int dp[][][]){
        if(idx==nums.length){
            if(gcd1!=0 && gcd2!=0 && gcd1==gcd2){
                return 1;
            }else{
                return 0;
            }
        }

        if(dp[idx][gcd1][gcd2]!=-1){
            return dp[idx][gcd1][gcd2];
        }

        int skip=solve(nums,idx+1,gcd1,gcd2,dp);
        int seq1=solve(nums,idx+1,gcd(gcd1,nums[idx]),gcd2,dp);
        int seq2=solve(nums,idx+1,gcd1,gcd(gcd2,nums[idx]),dp);
        long ans=(long)skip+seq1+seq2;
        return dp[idx][gcd1][gcd2]=(int)(ans%mod);
    }

    public int subsequencePairCount(int[] nums) {
        int dp[][][]=new int[nums.length+1][201][201];
        for(int i=0;i<nums.length+1;i++){
            for(int j=0;j<201;j++){
                for(int k=0;k<201;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        
        return solve(nums,0,0,0,dp);
    }
}