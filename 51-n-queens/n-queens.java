class Solution {
    List<List<String>> ans;
    public List<List<String>> solveNQueens(int n) {

        ans= new ArrayList<>();
        int board[][]= new int [n][n];
		
		find(0,board);
        return ans;

    }
    public void find(int row,int board[][] ) {
		if(row==board.length) {
			List<String> list= new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                String s="";
			for (int j = 0; j < board.length; j++) {
				if(board[i][j]==1) {
					s=s+"Q";
				}
				else s=s+".";
			}
			list.add(s);
		}
        ans.add(new ArrayList<>(list));
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			
			if(isSafe(row,col,board)==true) {
				board[row][col]=1;
				find(row+1,board);
				board[row][col]=0;
			}
		}
	}
	public static boolean isSafe(int row,int col,int board[][]) {
		int r=row;
		int c=col;
		//left dia
		while(r>=0 && c>=0) {
			if(board[r][c]==1) return false;
			r--;
			c--;
			
		}
		r=row;
		c=col;
		//right dia
		while(r>=0 && c<board.length) {
			if(board[r][c]==1) return false;
			r--;
			c++;
		}
		//vertical
		r=row;
		c=col;
		while(r>=0) {
			if(board[r][c]==1) return false;
			r--;
		}
		return true;
		
	}
	static void print(int board[][]) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j]==1) {
					System.out.print("Q  ");
				}
				else System.out.print("_ ");
			}
			System.out.println();
		}
		System.out.println();
	}
}