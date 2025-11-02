class Solution {
    public int rob(int[] nums) {
        int dp[][] = new int [nums.length][2];
        dp[0][0]=nums[0];
        dp[0][1]=0;
        for(int i=1;i<nums.length-1;i++){
            dp[i][0]= dp[i-1][1]+nums[i];
            dp[i][1]=Math.max(dp[i-1][0],dp[i-1][1]);
        }
        int a=nums[0];
        if(nums.length>1)
       a=Math.max(dp[nums.length-2][0],dp[nums.length-2][1]);
        int dp1[][]= new int [nums.length][2];
         for(int i=1;i<nums.length;i++){
            dp1[i][0]= dp1[i-1][1]+nums[i];
            dp1[i][1]=Math.max(dp1[i-1][0],dp1[i-1][1]);
        }
        int b=Math.max(dp1[nums.length-1][0],dp1[nums.length-1][1]);
        return Math.max(a,b);
    }
}