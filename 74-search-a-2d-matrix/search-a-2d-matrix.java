class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=findRow(matrix,target);
        if(row==-1)return false;
        int s=0;
        int e=matrix[0].length-1;

        while(s<=e){
         int mid=(s+e)/2;
         if(matrix[row][mid]==target) return true;
         else if(matrix[row][mid]>target) e=mid-1;
         else s=mid+1;

        }
        return false;
        
    }
    public static int findRow(int matrix[][],int target){
        int s=0;
        int e=matrix.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(matrix[mid][0]<= target && matrix[mid][matrix[0].length-1]>=target){
                return mid;
            }
            else if(matrix[mid][0]>target) e=mid-1;
            else  s=mid+1;
        }
        return -1;
    }
}