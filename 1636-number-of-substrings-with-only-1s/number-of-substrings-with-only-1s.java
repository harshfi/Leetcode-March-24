class Solution {
    public int numSub(String s) {
        
        int sum=0;
        int mod=(int)((int)1e9+7);
        int i=0;
        while(i<s.length()){

            int j=i;

            while(j<s.length() && s.charAt(j)=='1'){
              
                sum=(sum+((j-i+1)%mod))%mod;
                j++;

            }
            if(i==j)i++;
            else i=j;
        }
        return sum;
    }
}