class KthLargest {
    PriorityQueue<Integer> pq= new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] arr) {
        this.k=k;
        for(int i=0;i<arr.length;i++){
            if(pq.size()<k)pq.add(arr[i]);
            else if(pq.size()==k && pq.peek()<arr[i]){
                  pq.remove();
                  pq.add(arr[i]);
            }
        }
    }
    
    public int add(int val) {
        if(pq.size()<k)pq.add(val);
         else  if(pq.size()==k && pq.peek()<val){
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