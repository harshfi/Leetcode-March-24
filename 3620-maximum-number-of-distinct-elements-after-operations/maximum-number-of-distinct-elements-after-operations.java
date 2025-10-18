import java.util.*;

class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        long last = Long.MIN_VALUE;
        int count = 0;

        for (int num : nums) {
            long start = (long) num - k;
            long end = (long) num + k;

            // Pick the smallest valid number > last
            long val = Math.max(start, last + 1);
            if (val <= end) {
                count++;
                last = val;
            }
        }

        return count;
    }
}
