class Solution {
    public String addBinary(String s1, String s2) {
         String ans="";
	    int i=s1.length()-1;
	    int j=s2.length()-1;
	    int c=0;		
		while(i>=0 && j>=0) {
			int d=(s1.charAt(i)-'0')+(s2.charAt(j)-'0')+c;
			ans=(d%2)+ans;
			c=d/2;
			i--;
			j--;
		}
		while(i>=0) {
			int d=(s1.charAt(i)-'0')+c;
			ans=(d%2)+ans;
			c=d/2;
			i--;
		}
		while(j>=0) {
			int d=(s2.charAt(j)-'0')+c;
			ans=(d%2)+ans;
			c=d/2;
			j--;
		}
		if(c>0)ans=c+ans;
      return(ans);
    }
}