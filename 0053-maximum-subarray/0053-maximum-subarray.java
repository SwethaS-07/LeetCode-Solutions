class Solution {
    public int maxSubArray(int[] nums) {
        int Curr_max = nums[0];
        int Max = nums[0];
        for(int i=1;i<nums.length;i++){
            Curr_max = Math.max(nums[i],Curr_max+nums[i]);
            Max = Math.max(Curr_max,Max);
        }
        return Max;
    }
}