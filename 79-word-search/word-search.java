class Solution {
    public boolean exist(char[][] board, String word) {
        int v[][]=new int [board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                boolean check=Find(board,word,v,0,i,j);
                if(check==true) return true;
            }
        }
        return false;
    }
    public boolean Find(char [][]board,String word,int v[][],int idx,int row,int col){
        if(idx==word.length()) return true;
        
        if(col<0 ||col>=board[0].length || row<0 ||
         row>=board.length||v[row][col]==1|| board[row][col]!= word.charAt(idx)) {
            return false;
        }

        v[row][col]=1;

        boolean left= Find(board,word,v,idx+1,row,col-1);
        boolean right= Find(board,word,v,idx+1,row,col+1);
        boolean up= Find(board,word,v,idx+1,row-1,col);
        boolean down= Find(board,word,v,idx+1,row+1,col);

        v[row][col]=0;
        return left|| right|| up||down;

    }
}