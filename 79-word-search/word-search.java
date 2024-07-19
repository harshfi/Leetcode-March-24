class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
               
                  boolean v[][]=new boolean[board.length][board[0].length];
                  boolean ans=  find(board,word,i,j,0,v);
                  if(ans==true)return true;
                
            }
        }
        return false;
        
    }
    public boolean find(char[][]board,String word,int i,int j,int idx,boolean v[][]){
        if(idx==word.length()){
            return true;
        }
        if(i<0 || j<0 ||i>=board.length || j>=board[0].length|| v[i][j] ||board[i][j]!=word.charAt(idx)) return false;

      
            v[i][j]=true;
           boolean down= find(board,word,i+1,j,idx+1,v);
           boolean up= find(board,word,i-1,j,idx+1,v);
           boolean right= find(board,word,i,j+1,idx+1,v);
           boolean left= find(board,word,i,j-1,idx+1,v);
           v[i][j]=false;
           return down||up||right||left;

        
        
    }
}