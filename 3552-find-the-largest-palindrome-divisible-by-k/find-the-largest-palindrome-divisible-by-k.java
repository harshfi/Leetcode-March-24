class Solution {
    public  static String largestPalindrome(int n, int k) {
    	StringBuilder sb= new StringBuilder();
    	
    	if(k==1||k==3||k==9) {
    		
    		for (int i = 0; i < n; i++) sb.append(9);
    		return sb.toString();
    	}
    	
    	if(k==2) {
    		sb.append(8);
    		for(int i=1;i<n-1;i++) sb.append(9);
    		sb.append(8);
    		return n==1?"8":sb.toString();
    	}
    	
    	if(k==5) {
    		sb.append(5);
    		for(int i=1;i<n-1;i++)sb.append(9);
    		sb.append(5);
    		return n==1?"5":sb.toString();
    	}
    	
    	if(k==4) {
    		if(n<=4) {
    			for (int i = 0; i < n; i++)sb.append(8);
    		}
    		else {
    			sb.append(88);
    			for (int i = 2; i < n-2; i++) sb.append(9);
    			sb.append(88);
    		}
    		return sb.toString();
    	}
    	
    	if(k==6) {
    		if(n<=2) return n==1?"6":"66";
    		if(n==3) return "888";
    		
    		
    		char ch[]=new char[n];
    		Arrays.fill(ch, '9');
    		ch[0]='8';
    		ch[n-1]='8';
    		ch[n/2]= n%2==1?'8':'7';
    		ch[(n-1)/2]= n%2==1?'8':'7';
    		
    		return new String(ch);
    	}
    	
    	if(k==8) {
    		
    		if(n<=6) {
    			for (int i = 0; i < n; i++)sb.append(8);
    		}
    		else {
    			sb.append(888);
    			for (int i = 3; i < n-3; i++) sb.append(9);
    			sb.append(888);
    		}
    		return sb.toString();
    		
    	}
    	
    	if(k==7) {
    		String str[]= {
    				"",
    				"7",
    				"77",
    				"959",
    				"9779",
    				"99799",
    				"999999",
    				"9994999",
    				"99944999",
    				"999969999",
    				"9999449999",
    				"99999499999"};
    	    int l = n / 12; //This gives the number of complete "999999" segments that can be placed on each side of the palindrome.
           int r = n % 12; //representing the number of characters left after accounting for the complete segments. The remainder helps in determining the middle part of the palindrome.

           String nines = "";
           while(l-->0) {
               nines += "999999";
           }
           
           return nines + str[r] + nines;
    	}
    	
    	return "";
        
    }
}