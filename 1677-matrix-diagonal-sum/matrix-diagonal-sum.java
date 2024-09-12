class Solution {
    public int diagonalSum(int[][] mat) {
        int leftdia= 0;
        int rightdia=0;
        int n=mat.length;
        int r=0;
        int c=0;

        while(r<n && c<n){
           leftdia+=mat[r][c];
           r++;
           c++;
        }
        r=0;
        c=n-1;
        while(r<n && c>=0){
          rightdia+=mat[r][c];
          r++;
          c--;
        }

        return n%2==0?leftdia+rightdia : leftdia+rightdia-mat[n/2][n/2];        
    }
}