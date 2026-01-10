class Solution {
    int[][] dp;

    public int splitArray(int[] nums, int k) {
        dp = new int[nums.length][k + 1];
        for (int[] row : dp) Arrays.fill(row, -1);
        return dfs(nums, 0, k);
    }

    int dfs(int[] nums, int i, int k) {
        if (k == 1) {
            int sum = 0;
            for (int x = i; x < nums.length; x++) sum += nums[x];
            return sum;
        }

        if (dp[i][k] != -1) return dp[i][k];

        int sum = 0;
        int res = Integer.MAX_VALUE;

        for (int j = i; j <= nums.length - k; j++) {
            sum += nums[j];
            int next = dfs(nums, j + 1, k - 1);
            res = Math.min(res, Math.max(sum, next));
        }

        return dp[i][k] = res;
    }
}
