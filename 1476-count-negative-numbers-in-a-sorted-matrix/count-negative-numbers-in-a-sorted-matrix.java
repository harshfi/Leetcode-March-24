class Solution {
    public int countNegatives(int[][] a) {
       
	int count=0;
		for (int i = 0; i < a.length; i++) {
			int idx=BinarySearch(a[i]);
			count=count+(a[i].length-idx);
			System.out.println(a[i].length+" "+idx);
		}
		return(count);
}
	public static int BinarySearch(int arr[]) {
		if(arr[arr.length-1]>=0) return arr.length;
		int s=0;
		int e=arr.length-1;
		
		int ans=0;
		while(s<=e) {
			int mid=(s+e)/2;
			if(arr[mid]<0) {
				ans=mid;
			    e=mid-1;
			}
			else s=mid+1;
		}
		return ans;
		
	}
    
}