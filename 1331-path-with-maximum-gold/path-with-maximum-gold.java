class Solution {
    int max=0;
    int n;
    int m;
    int a[][];
    int v[][];
    public int getMaximumGold(int[][] grid) {
         max=0;
         a=grid;
         n=grid.length;
         m=grid[0].length;
         v = new int [n][m];
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(grid[i][j]!=0 ){
                find(i,j,0);
               }
            }
         }
         return max;
        
    }
    public void find(int i, int j,int sum ){
        if(i>=n || j>=m || i<0 || j<0 || a[i][j]==0) {
            max=Math.max(sum,max);
            return ;
        }
        if(v[i][j]==1){
            max=Math.max(sum,max);
            return;
            }
        v[i][j]=1;
        find(i+1,j,sum+a[i][j]);//down
        find(i-1,j,sum+a[i][j]);
        find(i,j+1,sum+a[i][j]);
        find(i,j-1,sum+a[i][j]);
        v[i][j]=0;
    }

}