class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int money1=robline(nums,0,n-2);
        int money2=robline(nums,1,n-1);
        return Math.max(money1,money2);
    }
    private int robline(int[] nums,int start,int end){
        int prev1=0;
        int prev2=0;
        for(int i=start;i<=end;i++){
            int temp=prev1;
            prev1=Math.max(prev1,prev2+nums[i]);
            prev2=temp;
        }
        return prev1;
    }
}