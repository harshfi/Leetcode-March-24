class Solution {
     Set<String> set;
     boolean ans=false;
     int dp[];
    public boolean wordBreak(String s, List<String> word) {
       set =new  HashSet<>();
       dp=new int [s.length()+1];
        for(String i: word) set.add(i);
       Queue<Integer> q= new LinkedList<>();
       q.add(0);
       while(!q.isEmpty()){
        int i= q.remove();
        if(i==s.length())return true;

        for(int j=i+1;j<=s.length();j++){
            if(dp[j]==1)continue;

            if(set.contains(s.substring(i,j))){
                dp[j]=1;
                q.add(j);
            }
        }
       }
        return false;
    }
  boolean  find(String s,int i){
        if(s.length()==i){
            ans=true;
            return true;
        }
        if(i>=s.length())return false;
        if(dp[i]!=0)return true;
        for( int j=i ;j<s.length();j++){
            String str=s.substring(i,j+1);
            if(set.contains(str)){
            //   System.out.println(str +" "+s.substring(j+1,s.length()));
              dp[i]= find(s,j+1) ?1:0;
                if(ans)return true;
            }
        }
        return dp[i]==1?true:false;
    }
}