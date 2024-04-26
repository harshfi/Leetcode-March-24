class Solution {
    static int min;
        public static int minimumOperations(int[][] grid) {
    	min=Integer.MAX_VALUE;
        int a[][]= new int [grid[0].length][10];
        
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
				a[i][grid[j][i]]++;
			}
		}
        int dp[][]=new int [grid[0].length][10];
        for (int i[] : dp) {
			Arrays.fill(i, -1);
		}
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j <= 9; j++) {
//            	if(a[i][j]!=0)
//				System.out.print(a[i][j]+"=>"+j+" ");
//			}
//            System.out.println();
//		}
       
//        for (int i = 0; i < dp.length; i++) {
//        	for (int j = 0; j < dp[0].length; j++) {
//        		System.out.print(dp[i][j]+" ");
//			}
//			
//		}
        return  find(grid,a,0,0,-1,dp);
    }
    
    public static int  find(int grid[][],int a[][],int op,int col,int restricted, int dp[][]) {
    	
    	if(col==grid[0].length) {
//    		System.out.println(op);
    		min=Math.min(min, op);
    		return 0;
    	}
    	if(restricted != -1 && dp[col][restricted]!=-1)return dp[col][restricted];
    	
    	int m=Integer.MAX_VALUE;
    	for (int i = 0; i < 10; i++) {

			if( restricted!=i ) {

				int v=find(grid,a,op+(grid.length-a[col][i]),col+1,i,dp)+(grid.length-a[col][i]) ;
				m=Math.min(m, v);
			}
		}
    	if(restricted!=-1)dp[col][restricted]=m;
    	return m;
    }
}