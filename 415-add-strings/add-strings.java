class Solution {
public static  String addStrings(String num1, String num2) {
	       int i=num1.length()-1;
		int j=num2.length()-1;
		String sum="";
		int c=0;
		while(i>=0 && j>=0) {
			
			int d=(num1.charAt(i)-'0')+(num2.charAt(j)-'0')+c;
			sum=(d%10)+sum;
			c=d/10;
			i--;
			j--;
		}
		while(j>=0) {
			int d=(num2.charAt(j)-'0')+c;
			sum=(d%10)+sum;
			c=d/10;
			j--;
		}
		
		while(i>=0) {
			int d=(num1.charAt(i)-'0')+c;
			sum=(d%10)+sum;
			c=d/10;
			i--;
		}
		if(c>0)sum=c+sum;
		return sum;
	    }
}