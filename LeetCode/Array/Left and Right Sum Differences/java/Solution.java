class Solution {
    public int[] leftRightDifference(int[] nums) {
        int answer[]=new int[nums.length];
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<nums.length;i++){
            rightsum=total-leftsum-nums[i];
            answer[i]=Math.abs(leftsum-rightsum);
            leftsum+=nums[i];
        }
        return answer;
    }
}