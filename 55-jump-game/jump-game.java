class Solution {
    public boolean canJump(int[] nums) {
        // int dp[]= new int [nums.length];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(max<i)return false;
            max=Math.max(max,i+nums[i]);
        }
        return true;
    }
}