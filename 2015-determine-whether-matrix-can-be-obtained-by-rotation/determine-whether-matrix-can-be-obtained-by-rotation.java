class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
      
      for(int i=1;i<=4;i++){
        mat=rotate(mat);
        if(compare(mat,target))return true;
      }
      return false;
   

    }
    boolean compare(int mat[][],int target[][]){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]!=target[i][j])return false;
            }
        }
        return true;
    }
    int[][] rotate(int mat[][]){

        int n = mat.length;
        int urow = 0, lrow = n - 1, lcol = 0, rcol = n - 1;

        int[][] dp = new int[n][n];

        while (urow <= lrow && lcol <= rcol) {

            // top row → right column
            for (int i = lcol; i <= rcol; i++) {
                dp[i][rcol] = mat[urow][i];
            }

            // right column → bottom row
            for (int i = urow + 1; i <= lrow; i++) {
                dp[lrow][rcol - (i - urow)] = mat[i][rcol];
            }

            // bottom row → left column
            for (int i = rcol - 1; i >= lcol; i--) {
                dp[lrow - (rcol - i)][lcol] = mat[lrow][i];
            }

            // left column → top row
            for (int i = lrow - 1; i > urow; i--) {
                dp[urow][lcol + (lrow - i)] = mat[i][lcol];
            }

            urow++;
            lrow--;
            lcol++;
            rcol--;
        }

        

        // copy back to original matrix
        return dp;
    }

}