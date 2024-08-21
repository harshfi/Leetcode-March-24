class Solution {
    public static String longestPalindrome(String s) {
		 String ans="";
	       for (int i = 0; i < s.length(); i++) {
			String s1= pal(s,i,i);
			String s2= i==s.length()-1?"": pal(s,i,i+1);
			// System.out.println(s1+" "+s2+" "+i);
			s1= s1.length()>s2.length()?s1:s2;
			ans=ans.length()>s1.length()?ans:s1;
		   }
	       return ans;
	    }
	 public static String pal(String s, int i,int j) {
		 
		 while(i>=0 && j<s.length()) {
			 
			 if(s.charAt(i)!= s.charAt(j)) {
				 if(j-i==1) return "";
				 else return s.substring(i+1,j);
			 }
			 i-- ;
			 j++;
		 }
		 
		 if(i<0)
		 return s.substring(0,j);
		 else if(j==s.length() && i>=0) {
			 return s.substring(i+1,j);
		 }
		 return s.substring(0,j);
		
	 }
}