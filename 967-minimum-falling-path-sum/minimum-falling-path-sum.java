class Solution {
    public int minFallingPathSum(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int dp[][]= new int [n][m];
        if(mat.length==1 && mat[0].length==1)return mat[0][0];
       for(int i=0;i<m;i++)dp[0][i]=mat[0][i];

       for(int i=1;i<n;i++){
        for(int j=0;j<m;j++){
            if(j==0){
             dp[i][j]=mat[i][j]+Math.min(dp[i-1][j],dp[i-1][j+1]);
            }
            else if(j==m-1 ){
             dp[i][j]=mat[i][j]+Math.min(dp[i-1][j],dp[i-1][j-1]);
            }
            else{
              dp[i][j]=mat[i][j]+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i-1][j+1]));
            }
        }
       }
       int min=Integer.MAX_VALUE;
       for(int i=0;i<m;i++){
        min=Math.min(dp[n-1][i],min);
       }

return min;
    }
}