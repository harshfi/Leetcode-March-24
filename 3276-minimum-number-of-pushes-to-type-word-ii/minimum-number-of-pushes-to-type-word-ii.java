class Solution {
    public static int minimumPushes(String word) {
        int a[][]=new int[26][2];


        for(int i=0;i<word.length();i++){
        	a[word.charAt(i)-'a'][0]=word.charAt(i)-'a';
            a[word.charAt(i)-'a'][1]++;
        }

        Arrays.sort(a,(i,j)->j[1]-i[1]);
        
       int push[]=new int[26];
       
       for (int i = 0; i < push.length; i++) {
    	   if(a[i][1]!=0)
		push[a[i][0]]=(i/8)+1;
	}
       int total_push=0;
       for (int i = 0; i < word.length(); i++) {
		total_push+=push[word.charAt(i)-'a'];
	}
        
        return total_push;

        

        
    }

}