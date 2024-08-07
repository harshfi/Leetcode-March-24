class Solution {
    public static  String numberToWords(int n) {
		if(n==0)return "Zero";
//	      String s[]={"Billon","Million","Thousand","Hundred"};
		String ten[] = { "Ten","Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		String tens[] = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		String ones[] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

	      
//	      int cnt= count(n);
	      int arr[]= push(n);
	      String str="";
	      //9-10
	     
	      if(arr[9]!=-1) {
	    	  
	    	  str+=ones[arr[9]]+" ";
	    	  
	    	  str+="Billion ";
	      }
	      
	      if((arr[6]!=-1 || arr[7]!=-1 || arr[8]!=-1) &&(arr[6]!=0 || arr[7]!=0 || arr[8]!=0) ) {
	    	  if(arr[8]!=-1 && arr[8]!=0) {
	    		  str+=ones[arr[8]]+" Hundred ";
	    	  }
	    	  if(arr[7]!=-1 && arr[7]!=1) {
	    		  str+=tens[arr[7]]+" ";
	    	  }
	    	  else if(arr[7]==1) {
	    		  str+=ten[arr[6]]+" ";
	    	  }
	    	  if(arr[7]!=1 && arr[6]!=0) str+=ones[arr[6]]+" ";
	    	  
	    	  str+="Million ";
	      }
	      
	      if((arr[3]!=-1 || arr[4]!=-1 || arr[5]!=-1) &&(arr[3]!=0 || arr[4]!=0 || arr[5]!=0)) {
	    	  if(arr[5]!=-1 && arr[5]!=0) {
	    		  str+=ones[arr[5]]+" Hundred ";
	    	  }
	    	  if(arr[4]!=-1 && arr[4]!=1) {
	    		  str+=tens[arr[4]]+" ";
	    	  }
	    	  else if(arr[4]==1) {
	    		  str+=ten[arr[3]]+" ";
	    	  }
	    	  if(arr[4]!=1&&arr[3]!=0) str+=ones[arr[3]]+" ";
	    	  
	    	  str+="Thousand ";
	      }
	      
	      
	    	  if(arr[2]!=-1 && arr[2]!=0) {
	    		  str+=ones[arr[2]]+" Hundred ";
	    	  }
	    	  if(arr[1]!=-1 && arr[1]!=1) {
	    		  str+=tens[arr[1]]+" ";
	    	  }
	    	  else if(arr[1]==1)  str+=ten[arr[0]]+" ";
	    	  
	    	  if(arr[1]!=1 && arr[0]!=0) str+=ones[arr[0]];
	    	  
	    	  
	      
	      
	      
	      return str.trim().replaceAll("  ", " ");
	      
	        
	    }
	public static int [] push(int n) {
		int arr[]= new int[10];
		Arrays.fill(arr, -1);
		int i=0;
		while(n>0) {
			arr[i]=n%10;
			n/=10;
			i++;
		}
//		for (int j = 0; j < arr.length; j++) {
//			System.out.println(arr[i]+" ");
//		}
		return arr;
	}
//	public static int count(int n) {
//		int cnt=0;
//		while(n>0) {
//			cnt++;
//			n/=10;
//		}
//		return cnt;
//	}

}