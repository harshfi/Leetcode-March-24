class Solution {
    public long maxMatrixSum(int[][] matrix) {

        long sum = 0;
        int minAbs = Integer.MAX_VALUE;
        int negCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                int val = matrix[i][j];

                if (val < 0) negCount++;

                int absVal = Math.abs(val);
                sum += absVal;

                minAbs = Math.min(minAbs, absVal);
            }
        }

        if (negCount % 2 == 0) return sum;

        return sum - 2L * minAbs;
    }
}
