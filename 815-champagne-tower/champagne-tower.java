class Solution {
    public double champagneTower(int poured, int row, int glass) {
 
        double arr[][]= new double [102][102];

        arr[0][0]=(double)poured;

        for(int i=0;i<=row;i++){
            for(int j=0;j<=glass;j++){
             double q= (arr[i][j]-1)/2;
             if(q>0){
                arr[i+1][j]+=q;
                arr[i+1][j+1]+=q;
             }
            }
        }

        // System.out.println(arr[row][glass]);
        return Math.min(1,arr[row][glass]);

        
    }
}