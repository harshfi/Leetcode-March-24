import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maximumLength(int[] nums, int k) {
        int[][] dp = new int[5000][51];
        int res = 0;
        int[] maxDp = new int[51];
        Map<Integer, Integer> prev = new HashMap<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            int p = prev.containsKey(nums[i]) ? prev.get(nums[i]) : i;
            for (int j = k; j >= 0; j--) {
                dp[i][j] = Math.max(1 + (i != p ? dp[p][j] : 0), 1 + (j != 0 ? maxDp[j - 1] : 0));
                maxDp[j] = Math.max(maxDp[j], dp[i][j]);
            }
            prev.put(nums[i], i);
            res = Math.max(res, dp[i][k]);
        }

        return res;
    }
}
