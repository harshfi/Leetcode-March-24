class Solution {
    public int findNumberOfLIS(int[] a) {
        int cnt=0;
		int n=a.length;
        int dp[]=new int[n], count[]=new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);
        int max=0;
        for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < i; j++) {
				if(a[i]>a[j] &&dp[i]<dp[j]+1 ) {
					dp[i]=1+dp[j];
					count[i]=count[j];
				}
				else if(dp[i]==dp[j]+1) {
					count[i]+=count[j];
				}
			}
			max=Math.max(max, dp[i]);
		}
        for (int i = 0; i < count.length; i++) {
			if(dp[i]==max) {
				cnt+=count[i];
			}
		}
       return cnt;
    }
}