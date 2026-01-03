class Solution {
    int mod = (int)1e9 + 7;
    char[] color = {'R','G','Y'};
    Map<String,Integer>[]dp;
    public int numOfWays(int n) {
        long res = 0;

        dp = new HashMap[n+1];
        for(int i = 0; i < n+1; i++) dp[i] = new HashMap<>();

        for(int j = 0; j < 3; j++){
        for(int k = 0; k < 3; k++){
        if(j == k) continue;
        for(int l = 0; l < 3; l++){
            if(k == l) continue;   

            String s = "" + color[j] + color[k] + color[l];
            res = (res + solve(n - 1, s)) % mod;
        }
    }
}

        return (int)res;
    }

    public int solve(int n, String prev){
        if(n == 0) return 1;
        
        if(dp[n].containsKey(prev))return dp[n].get(prev);

        long res = 0;

        for(int j = 0; j < 3; j++){
            if(color[j] == prev.charAt(0)) continue;

            for(int k = 0; k < 3; k++){
                if(j == k || color[k] == prev.charAt(1)) continue;

                for(int l = 0; l < 3; l++){
                    if( k == l || color[l] == prev.charAt(2)) continue;

                    String s = "" + color[j] + color[k] + color[l];
                    res = (res + solve(n - 1, s)) % mod;
                }
            }
        }
       dp[n].put(prev,(int)res);
        return (int)res;
    }
}
