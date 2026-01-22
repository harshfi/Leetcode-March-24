class Solution {
    int dp[];
    public boolean wordBreak(String s, List<String> list) {
       dp= new int [s.length()+1];

        return solve(s,list,  0);
    }
    
    boolean solve(String s, List<String> list, int i){
      if(s.length()==i){ return true; } 
      if(dp[i]==1)return false;
      for( int j=i;j<s.length();j++){
         if(list.contains(s.substring(i,j+1)))
            {
                 boolean check=solve(s,list,j+1);
                 if(check==true)return true;
           } 
           }

           dp[i]=1;
           return false;
    }
    
}