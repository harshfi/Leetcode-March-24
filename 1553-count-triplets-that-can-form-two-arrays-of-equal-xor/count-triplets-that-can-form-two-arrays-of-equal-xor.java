class Solution {
     public static int countTriplets(int[] arr) {
    	int cnt=0;
        
    	for (int i = 0; i < arr.length; i++) {
    		long xora=0;
    		for (int j= i+1; j < arr.length; j++) {
    			xora=xora^arr[j-1];
    			long xorb=0;
    			for (int k = j; k < arr.length; k++) {
    				xorb=xorb^arr[k];
    				if(xora==xorb ) {
//    					System.out.println(i+" "+j+" "+k);
    					cnt++;
    				}
    			}
				
			}
			
		}
    	return cnt;
    }
}