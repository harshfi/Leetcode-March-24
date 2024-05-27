class Solution {
static  int min=1000000;
	    public static int jump(int[] nums) {
             min=1000000;
             int dp[]=new int [nums.length];
             Arrays.fill(dp,1000000);
	         if(nums.length==1)return 0;
	         
	       
	        	return find(nums,0,dp);
	        
	        
	        // return min;
	    }
	    public static int  find(int []nums,int i,int dp[]){
	        if(i>=nums.length-1){
	        //    min=Math.min(min,c);
	           return 0;
	        }
	        if(nums[i]==0)return 1000000 ;

            if(dp[i]!=1000000)return dp[i];

	        for(int j=1+i;j<=nums.length && j<=nums[i]+i;j++){

	          int c=1+find(nums,j,dp);
              dp[i]=Math.min(c,dp[i]);
	        }
            return dp[i];


	    }



}