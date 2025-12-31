class Solution {
    public boolean isMatch(String s, String p) {
        Boolean dp[][]= new Boolean [s.length()][p.length()+1];
        return find(0, 0, s, p,dp);
    }

    public boolean find(int i, int j, String s1, String s2,Boolean dp[][]) {

        if (i == s1.length() && j == s2.length()) return true;

        if (i == s1.length()) {
            while (j < s2.length()) {
                if (s2.charAt(j) != '*') return false;
                j++;
            }
            return true;
        }
        
        if(dp[i][j]!=null)return dp[i][j];

        if (j == s2.length()) return false;

        if (s2.charAt(j) == '?') {
            return dp[i][j]=find(i + 1, j + 1, s1, s2,dp);
        }

        if (s2.charAt(j) == '*') {
            return dp[i][j]=find(i, j + 1, s1, s2,dp) || find(i + 1, j, s1, s2,dp);
        }

        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j]= find(i + 1, j + 1, s1, s2,dp);
        }

        return dp[i][j]=false;
    }
}
