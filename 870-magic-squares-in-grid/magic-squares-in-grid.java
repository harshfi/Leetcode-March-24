class Solution {
       public static int numMagicSquaresInside(int[][] grid) {
    	  int cnt=0;
    	  for (int i = 0; i+2 < grid.length; i++) {
    		  
			for (int j = 0; j+2 < grid[0].length; j++) {
				
				if(check(i,j,grid)) {
					cnt++;
				}
			}
		}
    	  return cnt;
        
    }
      public static boolean check(int r,int c,int [][]a) {
    	  int sum=0;
    	  //distinct number
    	  int b[]= new int [16];
    	  for (int i = r; i < r+3; i++) {
			for (int j = c; j < c+3; j++) {
				if(a[i][j]==0 || a[i][j]>=10)return false;
				else if(b[a[i][j]]==1) return false;
				else b[a[i][j]]++;
			}
		}
    	  for (int i = r; i < r+3; i++) {
			sum+= a[i][c];
		}
    	  //row
    	  for(int i=r;i<r+3;i++) {
    		  int csum=0;
    		  for (int j = c; j <c+3; j++) {
				csum+=a[i][j];
			}
    		  if(sum!=csum)return false;
    	  }
    	  
    	  
    	  
    	  //col
    	  
    	  for (int i = c; i < c+3; i++) {
    		  int csum=0;
    		  for (int j = r; j <r+3; j++) {
				csum+=a[j][i];
			}
    		  if(sum!=csum)return false;
		}
    	  //dia left-right
    	  
    	  int i=r,j=c;
    	  int csum=0;
    	  while(i<r+3 && j<c+3) {
    		  csum+=a[i++][j++];
    	  }
    	  if(sum!=csum)return false;
    			  
    	  i=r;
    	  j=c+2;
    	  csum=0;
    	  while(i<r+3 && j>=c)csum+=a[i++][j--];
    	  if(sum!=csum)return false;
    	  
    	  return true;
      }


}