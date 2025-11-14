class Solution {
    public int[][] rangeAddQueries(int n, int[][] q) {

       int arr[][]= new int[n][n];

       for(int i [] : q ){
        
        for(int row=i[0];row<=i[2];row++){

            for(int col=i[1];col<=i[3];col++){
                arr[row][col]++;
            }
        }

       }

       return arr;

    }
}