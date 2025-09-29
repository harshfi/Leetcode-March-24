class Solution {
    public int minScoreTriangulation(int[] v) {
        int dp[][]= new int [v.length][v.length];
        
       return find(v,dp,0,v.length-1);

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