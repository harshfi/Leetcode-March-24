class Solution {
   public int removeStones(int[][] s) {
        
    	 int n=s.length;
         List <Integer> []  l= new List [n];
         
         for (int i = 0; i < l.length; i++) {
			l[i]=new ArrayList<>();
		}

         for(int i=0;i<s.length;i++) {
        	 for(int j=i+1;j<s.length;j++ ) {
        		 if(s[i][0]==s[j][0] ||s[j][1]==s[i][1]) {
        			 
        			 l[i].add(j);
        			 l[j].add(i);
        		 }
        	 }
         }
         
         int count=0;
         int v[]= new int [n];
         
         for (int i = 0; i < v.length; i++) {
			
        	 if(v[i]==0) {
        		 dfs(l,v,i);
        		 count++;
        	 }
		}
         return n-count;
      
    }
    
    private void dfs(List<Integer> []  l, int []v,int i) {
    	v[i]=1;
    	for (int  j : l[i]) {
			
    		if(v[j]==0) {
    			dfs(l,v,j);
    		}
		}
    }
}