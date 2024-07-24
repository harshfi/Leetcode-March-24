class Solution {
    List<List<String>> list;
    public List<List<String>> solveNQueens(int n) {
        list=new ArrayList<>();
        int board[][]=new int[n][n];
        find(board,n,0);
        return list;
    }
    public void find(int board[][],int n,int row){
        if(n==0){
            List<String> l=new ArrayList<>();
            for(int i=0;i<board.length;i++){
                String str="";
                for(int j=0;j<board.length;j++){
                    if(board[i][j]==1)str+="Q";
                    else str+='.';
                }
                l.add(str);
            }
            list.add(new ArrayList<>(l));
            return ;

        }
        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
                board[row][i]=1;
                find(board,n-1,row+1);
                board[row][i]=0;
            }
        }
    }
    public boolean isSafe(int board[][],int row,int col){
        //left dia
        int r=row;
        int c=col;
        while(r>=0 && c>=0){
            if(board[r][c]==1){
                return false;
            }
            r--;
            c--;
        }
        //right dia
        r=row;
        c=col;
        while(r>=0 && c<board.length){
            if(board[r][c]==1){
                return false;
            }
            r--;
            c++;
        }
        //vertical
         r=row;
        c=col;
        while(r>=0){
            if(board[r][c]==1){
                return false;
            }
            r--;

        }
        return true;
    }
}