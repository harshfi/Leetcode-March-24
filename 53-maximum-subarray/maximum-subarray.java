class Solution {
    public int maxSubArray(int[] nums) {
        int currsum =0;
        int maxSubArray=Integer.MIN_VALUE;
        for(int i = 0; i<nums.length;i++){
            currsum = Math.max(nums[i], nums[i]+currsum);
            maxSubArray=Math.max(maxSubArray, currsum);
        }
        return maxSubArray;
        
    }
}