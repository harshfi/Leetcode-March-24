class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int cnt=0;
        for(int i=0;i<=grid.length-3;i++){
            for(int j=0;j<=grid[0].length-3;j++){
                boolean check=find(grid,i,j);
                if(check)cnt++;
            }
        }
        return cnt;
    }
   public static boolean find(int[][] grid, int row, int col) {

    // if (grid[row+1][col+1] != 5) return false;

    int[] arr = new int[10];

    for (int i = row; i < row + 3; i++) {
        for (int j = col; j < col + 3; j++) {
            if (grid[i][j] < 1 || grid[i][j] > 9) return false;
            if (++arr[grid[i][j]] > 1) return false;
        }
    }

    int sum = 0;
    for (int j = col; j < col + 3; j++) {
        sum += grid[row][j];
    }

    for (int i = row; i < row + 3; i++) {
        int rowSum = 0;
        for (int j = col; j < col + 3; j++) {
            rowSum += grid[i][j];
        }
        if (rowSum != sum) return false;
    }

    for (int j = col; j < col + 3; j++) {
        int colSum = 0;
        for (int i = row; i < row + 3; i++) {
            colSum += grid[i][j];
        }
        if (colSum != sum) return false;
    }

    if (grid[row][col] + grid[row+1][col+1] + grid[row+2][col+2] != sum) return false;
    if (grid[row][col+2] + grid[row+1][col+1] + grid[row+2][col] != sum) return false;

    return true;
}

}