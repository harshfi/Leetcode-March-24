class Solution {
    public boolean canPartition(int[] nums) {
        
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0)return false;

        Boolean dp[][]= new Boolean[nums.length][(sum/2) +1];


        return find(sum/2,nums,nums.length-1,dp);
    }
    public static boolean find(int target, int nums[],int i,Boolean dp[][]){
         
          if(target==0)return true;
         if(i==-1|| target<0)return false;
       

        if(dp[i][target]!=null)return dp[i][target];
        boolean in=find(target-nums[i],nums,i-1,dp);
        boolean ex=find(target,nums,i-1,dp);

        //   true;
        return dp[i][target]= in||ex;
    }
}