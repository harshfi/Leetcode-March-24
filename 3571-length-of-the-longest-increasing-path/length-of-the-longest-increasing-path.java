class Solution {
  public static int maxPathLength(int[][] c, int k) {
		   
		 int a[][]=c;
		 int x=a[k][0],y=a[k][1];
		   
//		   print(a);
		   Arrays.sort(a,(new Comparator<int []>() {
			 public int compare(int i[], int j[]) {
				 
				 if(i[0]!=j[0]) return i[0]-j[0];
				 
				 return j[1]-i[1];
			 }
		   }));
//		   System.out.println();
		   int idx=0;
		   
		   for (int i = 0; i < a.length; i++) {
			
			   if(a[i][0]==x && a[i][1]==y) {
				   
				   idx=i;
				   break;
			   }
		    }
//		   print(c);
//		   System.out.println(a[idx][0]+" "+a[idx][1]);
//		   System.out.println();
		   
		
		  List<Integer> d= filter(a,0,idx,x,y,true);
		  List<Integer> u= filter(a,idx+1,a.length,x,y,false);
		  
		  
		  return find(d)+find(u)+1;
	    }
	     public static List<Integer> filter(int a[][],int i,int j,int x,int y, boolean isLeft){
	    	 List<Integer> l= new ArrayList<>();
	    	 for (; i < j; i++) {
				if(isLeft && a[i][0]<x && a[i][1]<y) l.add(a[i][1]);
				
				else if(isLeft==false && a[i][0]>x && a[i][1]>y) l.add(a[i][1]);
			}
	    	 return l;
	     }
	public static  int find(List <Integer> list) {
		List<Integer> l= new ArrayList<>();
		for( int i: list) {
			int index=Collections.binarySearch(l, i);
			
			if(index<0) index=-index-1;
			
			if(l.size()==index)  l.add(i);
			else l.set(index, i);
			
		}
		return l.size();
	}
	static void print(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i][0]+" "+a[i][1]);
		}
	}
	

}