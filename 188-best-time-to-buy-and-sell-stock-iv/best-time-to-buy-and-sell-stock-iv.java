class Solution {
    public int maxProfit(int k, int[] p) {
     int n = p.length;
        int[][][] dp = new int[n][2][k+1];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < 2; j++)
                Arrays.fill(dp[i][j], -1);

        return solve(dp, p, 0, 1, k);
    }

    int solve(int[][][] dp, int[] p, int i, int buy, int cnt) {
        if (i == p.length || cnt == 0) return 0;

        if (dp[i][buy][cnt] != -1)
            return dp[i][buy][cnt];

        int nt = solve(dp, p, i+1, buy, cnt);
        int t;

        if (buy == 1) {
            t = solve(dp, p, i+1, 0, cnt) - p[i];
        } else {
            t = solve(dp, p, i+1, 1, cnt-1) + p[i];
        }

        return dp[i][buy][cnt] = Math.max(t, nt);
    }
}