class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int dp[][]= new int[s1.length()][s2.length()];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return find(s1, s2, 0, 0,dp);
    }

    public int find(String s1, String s2, int i, int j, int dp[][]) {

        // If s1 is exhausted, delete rest of s2
        if (i == s1.length()) {
            int sum = 0;
            for (int k = j; k < s2.length(); k++) {
                sum += s2.charAt(k);
            }
            return sum;
        }

        // If s2 is exhausted, delete rest of s1
        if (j == s2.length()) {
            int sum = 0;
            for (int k = i; k < s1.length(); k++) {
                sum += s1.charAt(k);
            }
            return sum;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        int take=1000000,nottake=1000000;
        
        if (s1.charAt(i) == s2.charAt(j)) {
            take=find(s1, s2, i + 1, j + 1,dp);
        }

        
        int deleteS1 = s1.charAt(i) + find(s1, s2, i + 1, j,dp);
        int deleteS2 = s2.charAt(j) + find(s1, s2, i, j + 1,dp);

        nottake= Math.min(deleteS1, deleteS2);
        return dp[i][j]=Math.min(take,nottake);
    }
}
