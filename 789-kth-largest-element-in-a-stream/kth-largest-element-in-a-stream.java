class KthLargest {
 PriorityQueue<Integer> pq  ;
 int k;
	public KthLargest(int k, int[] nums) {
        this.k=k;
		pq= new PriorityQueue<>(); 
		for(int i=0;i<k && i<nums.length;i++) {
			pq.add(nums[i]);
		}
		for (int i = k; i < nums.length; i++) {
			
			if(nums[i]>pq.peek()) {
				pq.remove();
				pq.add(nums[i]);
				}
		}
		
		 
	    }
	    
	    public int add(int val) {
            if(pq.size()<k){
                pq.add(val);
                return pq.peek();

            } 
	    	if(val>pq.peek()) {
				pq.remove();
				pq.add(val);
				
				}
	    	return pq.peek();
	        
	    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */