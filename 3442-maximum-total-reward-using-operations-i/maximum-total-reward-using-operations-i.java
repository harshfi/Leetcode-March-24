class Solution {
   public static  int maxTotalReward(int[] reward) {
	int n=reward.length;
	Arrays.sort(reward);
	   int dp[][]=new int [n+1][2*2000+1];
	   for(int i[]:dp)Arrays.fill(i, -1);
        return findd(dp,0,reward,0);
    }
private  static int findd(int dp[][],int i,int a[],int re) {
	if(i>=a.length)return 0;
	
	int ii=0,e=0;
	if(dp[i][re]!=-1)return dp[i][re];
	if(re<a[i])ii=findd(dp,i+1,a,re+a[i])+a[i];
	
	e=findd(dp,i+1,a,re);
	
	return dp[i][re]=Math.max(ii, e);
	

}
}