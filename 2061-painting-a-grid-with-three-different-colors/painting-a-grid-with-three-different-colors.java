class Solution {
    List<String> allCombo=new ArrayList<>();
    char color[]= {'R','Y','B'};
    int mod=(int)1e9+7;

    public int colorTheGrid(int m, int n) {
        find(m,"");

        int dp[][]= new int [n][allCombo.size()];
         
        for(int i[]:dp)Arrays.fill(i,-1);
         long res=0;
        for(int i=0;i<allCombo.size();i++){
            res=(res+solve(n-1,allCombo.get(i),i,dp))%mod;
        }
        return (int)res;
    }
    public  int solve(int n, String prev,int pi ,int dp[][]){
        if(n==0)return 1;
        

        if(dp[n][pi]!=-1)return dp[n][pi];
        long res=0;
        for(int i=0;i<allCombo.size();i++){
            if(allCombo.get(i).equals(prev))continue;
             int check=0;
            for(int j=0;j<allCombo.get(i).length();j++){
                if(allCombo.get(i).charAt(j)==prev.charAt(j)){
                    check=1;
                    break;
                }
            }
            if(check==0)res=(res+solve(n-1,allCombo.get(i),i,dp))%mod;

            
        }
        return dp[n][pi]= (int)res;
    }
    public  void find(int n,String combo){
        if(n==0){
            allCombo.add(combo);
            return ;
        }

        for(char ch: color){
            if(combo.length()!=0 && combo.charAt(combo.length()-1)== ch){
               continue;
            }
            else{
                find(n-1,combo+ch);
            }
        }


    }
}