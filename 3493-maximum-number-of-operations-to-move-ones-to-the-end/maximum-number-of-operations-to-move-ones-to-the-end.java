class Solution {
    public int maxOperations(String s) {
        int ans = 0;
        int cnt = 0;               // number of '1's seen so far
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == '1') {
                ++cnt;
            } else if (i > 0 && s.charAt(i - 1) == '1') {
                // first '0' after a block of '1's:
                ans += cnt;
            }
        }
        return ans;
    }
}