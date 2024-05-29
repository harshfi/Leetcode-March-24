class Solution {
     public static  int numSteps(String s) {
		    int n=s.length();
            if(n==1)return 0;
	        int a[]=new int [n+1];
	        
	        for(int i=0;i<n;i++) {
	           a[i]=s.charAt(n-1-i)-48;
//	           System.out.print(a[i]+" ");
	        }
//	        Arrays.reverse(a);
	        
	        int cnt=0;
	        while(true) {
	        	if(a[0]==1) {
	        		int i=0;
	        		while(a[i]==1) {
	        			a[i]=0;
	        			i++;
	        		}
	        		a[i]=1;
	        	}
	        	else {
	        		for (int i = 0; i <n; i++) {
						a[i]=a[i+1];
					}
	        		a[n]=0;
	        		
	        	}
//	        	System.out.println(0);
	        	cnt++;
	        	if(a[0]==1 && check(a))break;
	        }
	       return(cnt);

	    }
	 static void print (int a[]) {
		 for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		 System.out.println();
	 }
	static boolean check(int [] a) {
		 for (int i = 1; i < a.length; i++) {
			if(a[i]==1) return false;
		}
		 return true;
	 }

}