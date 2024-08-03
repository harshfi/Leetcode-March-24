class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length];
        Arrays.fill(dp,-1);
        int oneStep= Cost(cost,0,dp);
        int twoStep= Cost(cost,1,dp);
        return Math.min(oneStep,twoStep);
    }
    public static int Cost(int cost[],int i,int dp[]){
        if(i>=cost.length)return 0;
         if(dp[i]!=-1)return dp[i];
          int oneStep= Cost(cost,i+1,dp);
          int twoStep= Cost(cost,i+2,dp);

         return dp[i]=Math.min(oneStep,twoStep)+cost[i];

    }
}