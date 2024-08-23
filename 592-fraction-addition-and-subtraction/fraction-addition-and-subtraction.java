class Solution {
   	 public static String fractionAddition(String e) {
	        int d[]= new int[11];
	        int deno=1;
	       for(int i=0;i<e.length();i++) {
	    	   
	    	   if(e.charAt(i)=='/'  ) {
	    		   
	    		   
	    		   
	    		   if((e.charAt(i+1)=='1' && i+2< e.length() && e.charAt(i+2)=='0')  ){
	    			   if(d[10]==0) {
	    				   d[10]=1;
		    			   deno*=10;
	    			   }
	    			  
	    		   }
	    		   else if(d[e.charAt(i+1)-'0']==0) {
	    			   d[(e.charAt(i+1)-'0')]=1;
	    			   deno*= ((e.charAt(i+1)-'0'));
	    		   }
//	    		   System.out.println(deno);
	    	   }
	       }
//	       System.out.println(deno);
	       int neo=0;
	       for (int i = e.length()-1; i>=0; i--) {
	    	   
	    	   if(e.charAt(i)=='/') {
	    		   int f=0;
	    		   if((e.charAt(i+1)=='1' && i+2< e.length() && e.charAt(i+2)=='0')  ){
		    			   f=deno/10;
	    		   }
	    		   else f= deno/((e.charAt(i+1)-'0'));
	    		   
	    		   int sum= f*((e.charAt(i-1)-'0')==0?10:(e.charAt(i-1)-'0'));
	    		   
	    		   if((i-2>=0 && e.charAt(i-2)=='-') || (i-3>=0  && e.charAt(i-2)=='1' && e.charAt(i-3)=='-') ) {
	    			   sum=sum*-1;
	    			   
	    		   }
//	    		  System.out.println(sum+" "+f); 
	    		   neo+=sum;
	    		   
	    	   }
			
		}
//	       System.out.println(neo);
	       if(neo==0) return "0/1";
	       int gcd=gcd(Math.abs(neo),Math.abs(deno));
	       String s= neo/gcd+"/"+deno/gcd;
	       return s;
	    }
	static int gcd(int a, int b) {
		 if(a%b==0) return b;
		 
		 return gcd(b,a%b);
	 }
}