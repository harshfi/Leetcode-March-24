class Solution {
    public int maxOperations(String s) {
        int ans=0;
        
        int cnt=0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='1'){
                cnt++;

            }
            else if(i>0 && s.charAt(i-1)=='1')ans=ans+cnt;
        }
        return ans;

    }
}