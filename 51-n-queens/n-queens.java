class Solution {
    List<List<String>> list=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        int ch[][]=new int [n][n];
        Queen(0,n,ch);
        return list;
        
       
    }
    public void Queen(int row,int n,int ch[][]){
        if(row==n){
            List<String> l=new ArrayList<>();
             for(int i=0;i<n;i++){
                String s="";
            for(int j=0;j<n;j++){
                if(ch[i][j]==1) s+='Q';
                else s+='.';
            }
            l.add(s);
        }
        // System.out.println("yes");
        if(!list.contains(l))
        list.add(new ArrayList<>(l));
        
            return ;
        }
        for(int i=0;i<n;i++){
            if(isSafe(row,i,ch)){
                ch[row][i]=1;
                Queen(row+1,n,ch);
                ch[row][i]=0;
            }
        }
     
    }
    public static boolean isSafe(int row,int col,int ch[][]){
        
        //diagonal
        int r=row,c=col;
        while(r>=0 && c>=0){
            if(ch[r][c]==1) return false;
            r--;
            c--;
        }
        //col
        r=row;
        while(r>=0){
            if(ch[r][col]==1) return false;
            r--;
        }
        r = row;
		c = col;
		while (r >= 0 && c < ch.length) {
			if (ch[r][c] == 1) {
				return false;
			}
			r--;
			c++;
		}
        return true;
    }
}