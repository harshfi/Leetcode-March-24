class Solution {
    public int trap(int[] arr) {
        	int left[]= new int [arr.length];
		int right[]= new int[arr.length];
		int leftMax=0;
		int rightMax=0;
	   for (int i = 0; i < arr.length; i++) {
		if(leftMax<arr[i]) {
			leftMax=arr[i];
		}
		left[i]=leftMax;
	}
	   for (int i = arr.length-1; i>=0; i--) {
			if(rightMax<arr[i]) {
				rightMax=arr[i];
			}
			right[i]=rightMax;
		}
	//    print(arr);
	//    print(left);
	//    print(right);
	   int waterHold=0;
	   for (int i = 0; i < right.length; i++) {
		waterHold+= Math.min(left[i], right[i])-arr[i];
	}
	  return(waterHold);
    }
}