class Solution {
    int max=0;
    public int lengthOfLIS(int[] nums) {
        int dp[][]=new int [nums.length][nums.length];
        for(int i[]: dp)
        Arrays.fill(i,-1);

        return  lis(nums,0,-1,dp);
    }
    public  int lis(int []nums,int i,int prev,int [][]dp){
        if(i>=nums.length){
        
         return 0;
        }

        if(prev!=-1 && dp[i][prev]!=-1)return dp[i][prev];

        int inc=0;
        if(prev==-1){
          inc=   lis(nums,i+1,i,dp)+1;
        }
        else if(nums[prev]<nums[i]) inc=   lis(nums,i+1,i,dp)+1;


        int exc= lis(nums,i+1,prev,dp);
          
          if(prev!=-1)dp[i][prev]=Math.max(inc,exc);
        return  Math.max(inc,exc);
        
    }
}