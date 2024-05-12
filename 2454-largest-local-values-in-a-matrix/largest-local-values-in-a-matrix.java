class Solution {
    public int[][] largestLocal(int[][] grid) {
        int a[][]=new int [grid.length-2][grid.length-2];
      int n=  grid.length;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                a[i][j]=max(grid,i,j);
            }
        }
        return a;
    }
    int max(int grid[][],int i,int j){
      int   max=-1;
      int n1=i+3;
      int n2=j+3;
      System.out.println(i+" "+j+" "+n1+" "+n2);
        for(int ii=i;ii<n1;ii++){
            for(int jj=j;jj<n2;jj++){
                max=Math.max(grid[ii][jj],max);
            }
        }
        return max;
    }
}