class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
       List<Integer>list=new ArrayList<>();
		for(int i=0;i<matrix.length;i++) {
			int col= MinRow(matrix,i);
		   boolean checkMaxCol= CheckMaxCol(matrix,matrix[i][col], col);
		   if(checkMaxCol) list.add(matrix[i][col]);
		}
        return list; 
    }
    public static boolean CheckMaxCol(int matrix[][],int max,int col) {
	    for(int i=0;i<matrix.length;i++) {
	    	if(max<matrix[i][col]) return false;
	    }
	    return true;
	}
	public static int MinRow(int matrix[][],int i) {
		
		int min=10000000;
		int idxMin=-1;
	    for (int j = 0; j < matrix[0].length; j++) {
			if(matrix[i][j]<min) {
				min=matrix[i][j];
				idxMin=j;
			}
		}
	    return idxMin;
		
	
	}
}