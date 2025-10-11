import java.util.*;

class Solution {
    public long maximumTotalDamage(int[] power) {
        if (power == null || power.length == 0) return 0L;

       
        TreeMap<Integer, Integer> freq = new TreeMap<>();
        for (int p : power) freq.put(p, freq.getOrDefault(p, 0) + 1);

        int n = freq.size();
        int[] vals = new int[n];
        long[] totalVal = new long[n]; // totalVal[j] = vals[j] * freq(vals[j])
        int idx = 0;
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            vals[idx] = e.getKey();
            totalVal[idx] = (long) e.getKey() * e.getValue();
            idx++;
        }

        long[] take = new long[n];
        long[] skip = new long[n];
        long[] bestPref = new long[n]; // bestPref[j] = max(take[j], skip[j])

        // j = 0
        take[0] = totalVal[0];
        skip[0] = 0L;
        bestPref[0] = Math.max(take[0], skip[0]);

        for (int j = 1; j < n; j++) {
            // find rightmost index i such that vals[i] <= vals[j] - 3
            int low = 0, high = j - 1, found = -1;
            int target = vals[j] - 3;
            while (low <= high) {
                int mid = (low + high) >>> 1;
                if (vals[mid] <= target) {
                    found = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            long base = (found >= 0) ? bestPref[found] : 0L;
            take[j] = totalVal[j] + base;
            skip[j] = bestPref[j - 1];
            bestPref[j] = Math.max(take[j], skip[j]);
        }

        return bestPref[n - 1];
    }

    // simple main for quick local testing
   
}
