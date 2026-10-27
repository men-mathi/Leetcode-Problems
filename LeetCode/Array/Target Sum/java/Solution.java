class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total=0;
        for(int n:nums){
            total+=n;
        }
        if((total+target)%2!=0){
            return 0;
        }
        if(Math.abs(target)>total){
            return 0;
        }
        int req=(total-target)/2;
        int dp[]=new int[req+1];
        dp[0]=1;
        for(int num:nums){
            for(int s=req;s>=num;s--){
                dp[s]+=dp[s-num];
            }
        }
        return dp[req];
    }
}