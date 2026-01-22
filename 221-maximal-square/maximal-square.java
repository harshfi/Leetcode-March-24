class Solution {
    public int maximalSquare(char[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int dp[][]= new int [arr.length][arr[0].length];
          int max=0;
         for (int i = 0; i < m; i++) {
            dp[i][0] = arr[i][0] - '0';
            max = Math.max(max, dp[i][0]);
        }

        // first row
        for (int j = 0; j < n; j++) {
            dp[0][j] = arr[0][j] - '0';
            max = Math.max(max, dp[0][j]);
        }

       
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
               
               if(arr[i][j]=='1'){
                dp[i][j]=Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]))+1;
                max=Math.max(dp[i][j],max);
               }
            }
        }
        return max*max;
    }
}