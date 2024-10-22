class Solution {
public static  String addStrings(String n1, String n2) {
	    String ans="";
		int c=0;
		int i=n1.length()-1;
		int j=n2.length()-1;
		while(i>=0 && j>=0) {
			int d= (n1.charAt(i)-'0')+(n2.charAt(j)-'0')+c;
			ans=(d%10)+ans;
			c=d/10;
			i--;
			j--;
		}
		
		while(i>=0) {
			int d= (n1.charAt(i)-'0')+c;
			ans=(d%10)+ans;
			c=d/10;
			i--;
		}
		
		while(j>=0) {
			int d= (n2.charAt(j)-'0')+c;
			ans=(d%10)+ans;
			c=d/10;
			j--;
		}
		if(c>0) ans=c+ans;
        return ans;
	    }
}