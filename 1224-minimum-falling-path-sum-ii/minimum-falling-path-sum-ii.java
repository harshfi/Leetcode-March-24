class Solution {
   	 public static int minFallingPathSum(int[][] grid) {
     
         int n=grid.length;
         int dp[][]=new int [n][n];
        
            for(int j[]:dp){
                Arrays.fill(j,-1000);
            }
         int ans= find(grid,0,-1,0,dp);
         
        
       
        
        return ans;
    }
	public static  int find(int grid[][], int sum , int restrictedCol, int i,int dp[][]){
        if(i>=grid.length){
             
              return 0;
        }
    

      int min=Integer.MAX_VALUE;
       
        if(restrictedCol!=-1 && dp[i][restrictedCol]!=-1000) return dp[i][restrictedCol];

        for(int j=0;j<grid.length;j++){
            if(j!=restrictedCol){
            min= Math.min( find(grid,sum+grid[i][j],j,i+1,dp )+grid[i][j],min);
            }
        }
        if(restrictedCol!=-1)dp[i][restrictedCol]=min;
        return min;
    }
}