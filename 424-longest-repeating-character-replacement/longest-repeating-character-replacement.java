class Solution {
    public int characterReplacement(String s, int k) {
       
        int ans=0;
        for(int i=0;i<s.length();i++){
            int changes=k,maxfq=0;
             int a[]= new int[26];
            for(int j=i;j<s.length();j++){
              
              a[s.charAt(j)-'A']++;

              maxfq=Math.max(maxfq,a[s.charAt(j)-'A']);

            int  changelen= (j-i+1)-maxfq;

            if(changelen<=changes){
               ans=Math.max(ans,j-i+1);
            }
             

              else break;
            }
           
        }
        return ans;
    }
}