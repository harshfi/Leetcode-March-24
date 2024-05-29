class NumArray {
   
		
		static int a[];
		static int n; 
		public static int  build(int []nums,int s,int e,int idx) {
			if(s>e)return 0;
			if(s==e)return a[idx]=nums[s];
			int mid=(s+e)/2;
			int l=build(nums,s,mid,2*idx);
			int r=build(nums,mid+1,e,2*idx+1);
			return a[idx]=l+r;
			
		}

	    public  NumArray(int[] nums) {
	        a=new int[nums.length*4];
	        n=nums.length;
	        build(nums,0,nums.length-1,1);
	        
	    }
	    public static void updateR(int i,int val,int s,int e,int idx) {
	    	if(i<s||e<i )return;
	    	if(s==e) {
	    		a[idx]=val;
	    		return;
	    	}
	    	int mid=(s+e)/2;
	    	updateR(i,val,s,mid,2*idx);
			updateR(i,val,mid+1,e,2*idx+1);
			 a[idx]=a[2*idx]+a[2*idx+1];
	    }
	    
	    public static  void update(int index, int val) {
	    	updateR(index,val,0,n-1,1);
	        
	    }
	    public static int find(int s,int e,int idx,int l,int r) {

	    	if(s>r || e<l||s>e)return 0;
	    	if(s>=l && e<=r) return a[idx];
	    	int mid=(s+e)/2;
	    int ll=	 find(s,mid,2*idx,l,r);
	    int rr=	 find(mid+1,e,2*idx+1,l,r);
	    return (ll+ rr);
	    }
	    
	    public static int sumRange(int left, int right) {
	       return find(0,n-1,1,left,right);
	    }

}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */