class Solution {
    boolean ans=false;
    public boolean isInterleave(String s1, String s2, String s3) {
        int dp[][][]= new int [s1.length()][s2.length()][s3.length()];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        solve(s1,s2,s3,0,0,0, dp);
        return ans;
    }
    public void solve(String s1, String s2, String s3, int i,int j, int k, int dp[][][]){
        if(s3.length()<=k){
            ans= (i == s1.length() && j == s2.length());
            return ;
        }
       
         if(i<s1.length()&& j<s2.length()&&dp[i][j][k]!=-1)return ;


        if(i<s1.length()&& s1.charAt(i)==s3.charAt(k)){
           solve(s1,s2,s3,i+1,j,k+1, dp);
        }
        if(ans==true)return ;
        if(j<s2.length()&&s2.charAt(j)==s3.charAt(k)){
            solve(s1,s2,s3,i,j+1,k+1,dp);
        }
        if(ans==true)return ;
        
     if(i<s1.length()&& j<s2.length())dp[i][j][k]=0;
        
    }
}