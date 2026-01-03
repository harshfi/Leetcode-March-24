class Solution {
    public int numOfWays(int n) {
        long a=6;//ABC
        long b=6;//ABA
        int mod=(int)1e9+7;

      for(int i=2;i<=n;i++){
        long aa=(a*2+b*2)%mod;
        long bb=(a*2+3*b)%mod;
        a=aa;
        b=bb;
      }
      return (int)((a+b)%mod);

    }
}