class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
           count+=rowBinary(grid,i);
        }
        return count;
    }

    public static int rowBinary(int [][]grid, int row){
        if(grid[row][0]<0) return grid[0].length;
        int i=0;
        int e=grid[0].length-1;
        int mid=0;
        int ans=0;
        while(i<=e){
           mid=(i+e)/2;
    
            if(grid[row][mid]<0){
               ans=grid[0].length-mid;
               e=mid-1;
            }
            else i=mid+1;
        }
        return ans;

    }

}