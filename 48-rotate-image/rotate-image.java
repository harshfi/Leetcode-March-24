class Solution {
    public void rotate(int[][] mat) {
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = dp[i][j];
            }
        }
    }
}