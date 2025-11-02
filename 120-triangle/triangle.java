class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        if (t == null || t.size() == 0) return 0;

        int dp[][] = new int[t.size()][];

        dp[0] = new int[1];
        dp[0][0] = t.get(0).get(0);

        for (int i = 1; i < t.size(); i++) {
            dp[i] = new int[t.get(i).size()];
            // leftmost
            dp[i][0] = dp[i-1][0] + t.get(i).get(0);

            for (int j = 1; j < t.get(i).size(); j++) {
                int val = t.get(i).get(j);
                if (j == t.get(i).size() - 1) {
                    // rightmost: only parent is dp[i-1][j-1]
                    dp[i][j] = dp[i-1][j-1] + val;
                } else {
                    // middle: parents dp[i-1][j-1] and dp[i-1][j]
                    dp[i][j] = Math.min(dp[i-1][j-1], dp[i-1][j]) + val;
                }
            }
        }

        int last = t.size() - 1;
        int ans = Integer.MAX_VALUE;
        for (int x : dp[last]) ans = Math.min(ans, x);
        return ans;
    }
}
