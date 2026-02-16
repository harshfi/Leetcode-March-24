class Solution {
    public long rob(int[] nums, int[] colors) {

        int n = nums.length;
        if (n == 1) return nums[0];

        long prev2 = 0;          // dp[i-2]
        long prev1 = nums[0];    // dp[i-1]

        for (int i = 1; i < n; i++) {

            long take;

            if (colors[i] != colors[i - 1]) {
                take = nums[i] + prev1;
            } else {
                take = nums[i] + prev2;
            }

            long curr = Math.max(prev1, take);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
