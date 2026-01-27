class Solution {
    public int reverseBits(int n) {
         String s="";
         while(n>0){
            s+=(n%2==0?'0':'1');
            n/=2;
         }
         while(s.length()!=32){
            s=s+0;
         }

         long ans=0;
         for(int i=0;i<s.length();i++){
           ans=ans+(long)(s.charAt(i)=='0'?0:1)*(long)Math.pow(2,31-i);
         }
         return (int)ans;
    }
}