import java.util.*;

class Solution {
    public long rob(int[] nums, int[] colors) {

        int n = nums.length;
        long[][] dp = new long[n][2];

        for (long[] row : dp)
            Arrays.fill(row, -1);

        return find(nums, colors, 0, false, dp);
    }

    public long find(int[] nums, int[] colors, int i, boolean prevTaken, long[][] dp) {

        if (i == nums.length)
            return 0;

        int prev = prevTaken ? 1 : 0;

        if (dp[i][prev] != -1)
            return dp[i][prev];

        long take = 0;

        // Can take if previous wasn't taken OR colors differ
        if (!prevTaken || colors[i] != colors[i - 1]) {
            take = nums[i] + find(nums, colors, i + 1, true, dp);
        }

        long notTake = find(nums, colors, i + 1, false, dp);

        dp[i][prev] = Math.max(take, notTake);
        return dp[i][prev];
    }
}
