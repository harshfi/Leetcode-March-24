class Solution {
    int[][] directions = {{1, 2}, {2, 1}, {2, -1}, {1, -2},
                         {-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}};
    public double knightProbability(int n, int k, int r, int c) {
        double dp[][][]= new double [n][n][k+1];
        for(double i[][]:dp){
            for(double j[]: i){
                Arrays.fill(j,-1);
            }
        }

        return find(n,k,r,c,dp);
    }
    public double find(int n, int k, int x, int y, double dp[][][]){

        if(k==0)return 1;
       

       if(dp[x][y][k]!=-1)return dp[x][y][k];
       double curr=0;

        for(int i[]: directions){

            int x1= x+ i[0];
            int y1= y+i[1];

            if(x1>=0 && x1<n && y1<n && y1>=0){
             
             curr+= find(n,k-1,x1,y1,dp)/8;
            }
        }
        dp[x][y][k]=curr;
        return curr;

    }
}