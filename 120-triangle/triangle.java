class Solution {
    
    public int minimumTotal(List<List<Integer>> t) {
        int dp[][]=new int[t.size()][];
        for(int i=0;i<t.size();i++){
            dp[i]=new int[t.get(i).size()+1];
            Arrays.fill(dp[i],1000000);
        }
       int x=find(t,0,0, dp);
    //    print(dp);
       return x; 
    }
    public void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int find(List<List<Integer>> t,int r, int c, int[][] dp){
        if(r==t.size()){
          
           return 0;
        }
        if(dp[r][c]!=1000000)return dp[r][c];
      int v1=100000, v2=100000;
      if(c<t.get(r).size())v1=t.get(r).get(c)+ find(t,r+1,c,dp);
      if(c+1<t.get(r).size())v2=t.get(r).get(c+1) +find(t,r+1,c+1, dp);

     if(c<dp[r].length)dp[r][c]=Math.min(v1,v2);
    //  if(c+1<dp[r].length)dp[r][c+1]=Math.min(v1,v2);

     return Math.min(v1,v2);



    }
}