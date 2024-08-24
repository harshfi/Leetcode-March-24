class Solution {
public static  String addStrings(String nums1, String nums2) {
	        int i=nums1.length()-1;
	       int  j=nums2.length()-1;
	        int idx=0;
	        String ans="";
	        int c=0;
	        while(i>=0 && j>=0){
	          int d= (nums1.charAt(i--)-'0')+(nums2.charAt(j--)-'0')+c;
	          ans=  d%10+ans;
	          c=d/10;
	        //   System.out.println(d);
	        }

	         while(i>=0){
	            int d= (nums1.charAt(i--)-'0')+c;
	              ans=  d%10+ans;
	             c=d/10;
	        }

	         while(j>=0){
	          int d=(nums2.charAt(j--)-'0')+c;
	           ans=  d%10+ans;
	          c=d/10;
	        }
	        if(c==1) ans=  1+ans;
	       
	      

	        return ans;
	    }
}