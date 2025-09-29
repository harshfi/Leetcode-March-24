class Solution {
    public int minScoreTriangulation(int[] v) {
        int dp[][]= new int [v.length][v.length];
         int n=v.length;
         for(int i=n-1;i>=0;i--){
            for(int j=i+2;j<n;j++){
                int ans=10000000;
                for(int k=i+1;k<j;k++){
                    ans=Math.min(ans,v[i]*v[k]*v[j]+dp[i][k]+dp[k][j]); 
                }
                System.out.println(ans);
                dp[i][j]=ans;
            }
         }
        
    
    return dp[0][n-1];

    }
    
    public int find(int v[],int dp[][], int i, int j ){
        if(i+1==j)return 0;
        if(i+1>=v.length)return 0;
        if(dp[i][j]!=0)return dp[i][j];
        int ans=10000000;
        for(int k=i+1;k<j;k++){
           ans=Math.min(ans,v[i]*v[k]*v[j]+find(v,dp,i,k)+find(v,dp,k,j));
        }
        dp[i][j]=ans;
        return ans;
    }
}