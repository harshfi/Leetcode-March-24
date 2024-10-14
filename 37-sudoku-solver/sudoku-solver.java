class Solution {
    static int a[];
    public void solveSudoku(char[][] board) {
        int arr[][]=new int[9][9];
         for(int i=0;i<board.length;i++)
         {
             for(int j=0;j<board.length;j++)
             {
                 if(board[i][j]!='.')
                 {
                     arr[i][j]= board[i][j]-'0';
                 }
                 
             }
         }
        SudokuSolver(arr,0,0,board);
       // return a;
    }
     public static void SudokuSolver(int[][] arr, int row, int col,char board[][]) {
		if (col == 9) {
			row++;
			col = 0;
		}
		if (row == 9) {
		Display(arr,board);
			return;
		}
		if (arr[row][col] != 0) {
			SudokuSolver(arr, row, col + 1,board);
		}

		else {
			for (int val = 1; val <= 9; val++) {
				if (isitsafe(arr, row, col, val) == true) {
					arr[row][col] = val;
					SudokuSolver(arr, row, col + 1,board);
					arr[row][col] = 0;
				}

			}
		}
	}
    public static boolean isitsafe(int[][] arr, int row, int col, int val) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][col] == val) {
				return false;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[row][i] == val) {
				return false;
			}
		}
		int r = row - row % 3;
		int c = col - col % 3;
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (arr[i][j] == val) {
					return false;
				}
			}

		}
		return true;

	}
     public static void Display(int[][] arr,char board[][]) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				 board[i][j]=(char)(arr[i][j] +48);
			}
			//System.out.println();
		}

	}
}