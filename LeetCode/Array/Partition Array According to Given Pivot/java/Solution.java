class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ind=0;
        int ans[]=new int[nums.length];
        for(int n:nums){
            if(n<pivot){
                ans[ind++]=n;
            }
        }
        for(int n:nums){
            if(n==pivot){
                ans[ind++]=n;
             }
        }
        for(int n:nums){
            if(n>pivot){
                ans[ind++]=n;
            }
        }
        return ans;
    }
}