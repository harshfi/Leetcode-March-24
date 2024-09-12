class Solution {
    public boolean isToeplitzMatrix(int[][] a) {
        int n= a.length;
        int m= a[0].length;

         int r=0;
         int c=0;
         while(r<n){
            c=0;
            int row=r;
            int ele=0;
            while(row<n && c<m){
                
                if(row==r && c==0) ele=a[row][c];
                else if(a[row][c]!=ele) return false;

                row++;
                c++;
            }
            r++;
         }

         c=1;
         while(c<m ){
            r=0;
           int col=c;
            int ele=0;
            while(col<m && r<n){
                if(col==c && r==0)ele=a[r][col];
                else if(a[r][col]!=ele) return false;
                col++;
                r++;
            }
            c++;
         }
       

        return true;
    }
}