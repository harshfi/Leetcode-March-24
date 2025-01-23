class Solution {
    public int maximumWealth(int[][] a) {
        int max=0;
         for(int row=0;row<a.length;row++){
            int sum=0;
            for(int col=0;col<a[0].length;col++){
                sum=sum+a[row][col];
            }
            if(max<sum)max=sum;
         }
         return max;
    }
}