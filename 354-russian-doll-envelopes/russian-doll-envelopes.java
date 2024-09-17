class Solution {
    public int maxEnvelopes(int[][] e) {
         Arrays.sort(e,new Comparator<int[]>() {
			 public int compare(int i[],int j[]) {
				 
				 if(i[0]==j[0]) return j[1]-i[1];
				 
				 return i[0]-j[0];
			 }
		 });
		 List<Integer> l= new ArrayList<>();
		 for (int i = 0; i < e.length; i++) {
			
			 int idx=Collections.binarySearch(l, e[i][1]);
				 if(idx<0)idx=-idx-1;
				 if(idx==l.size()) l.add(e[i][1]);
				 else l.set(idx, e[i][1]);
				 
		 }
		 
		 return l.size();
		 
    }
}