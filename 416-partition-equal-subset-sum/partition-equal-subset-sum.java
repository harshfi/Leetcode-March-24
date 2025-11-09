class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) sum += i;
        if (sum % 2 != 0) return false;

        int n = nums.length;
        int target = sum / 2;
        boolean[][] dp = new boolean[n + 1][target + 1];

        dp[0][0] = true;
        for (int i = 1; i <= n; i++) {
            dp[i][0] = true;              // zero sum is always possible
            int val = nums[i - 1];        // i-th row corresponds to nums[i-1]
            for (int s = 1; s <= target; s++) {
                dp[i][s] = dp[i - 1][s];  // don't take nums[i-1]
                if (s - val >= 0 && dp[i - 1][s - val]) {
                    dp[i][s] = true;     // take nums[i-1]
                }
            }
        }

        return dp[n][target];
    }
}
