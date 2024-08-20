class Solution {
    static class Pair{
		int val;
		int col;
		Pair(int val, int col){
			this.val=val;
			this.col=col;
		}
	}
   public static long maximumValueSum(int[][] board) {
    	Pair arr[][]= new Pair[board.length][3];
    	int n=board.length;
    	
    	for(int i=0;i<board.length;i++) {
    		PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.val));
    		Pair p;
    		
    		for (int j = 0; j < board[0].length; j++) {
				if(j<3) {
					
					Pair q= new Pair(board[i][j],j);
        			pq.add(q);
					
				}
				else if (pq.peek().val<board[i][j]) {
    				Pair q= new Pair(board[i][j],j);
    				pq.remove();
        			pq.add(q);
    			}
			}
    		int l=0;
    		while(!pq.isEmpty()) {
    			arr[i][l]=pq.poll();
    			l++;
    		}
    	}
    	long ans= (long)Long.MIN_VALUE;
    	for(int i=0;i<n;i++) {
    		for(int j=i+1;j<n;j++) {
    			for(int k=j+1;k<n;k++) {
    				for (int x = 0; x < 3; x++) {
						 for (int y = 0; y < 3; y++) {
							for (int z = 0; z < 3; z++) {
								
								if(arr[i][x].col==arr[j][y].col || arr[i][x].col==arr[k][z].col || arr[j][y].col==arr[k][z].col) continue;
								long sum=(long)arr[i][x].val+(long)arr[j][y].val+(long)arr[k][z].val;
								ans=Math.max(ans,sum);
								
							}
						}
					}
    			}
    		}
    	}
    	return ans;
        
    }
}