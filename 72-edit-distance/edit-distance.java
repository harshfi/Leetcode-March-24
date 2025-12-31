class Solution {
    public int minDistance(String text1, String text2) {
        
     int dp[][]= new int[text1.length()][text2.length()];
        
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }

        return find(text1.length()-1,text2.length()-1, text1,text2,dp);
    }
    public static int find(int i, int j, String s, String s2,int dp[][]){

     if (i < 0) return j + 1;   
if (j < 0) return i + 1;  


     if(dp[i][j]!=-1)return dp[i][j];
      
     if(s.charAt(i)==s2.charAt(j)){
       return dp[i][j]= find(i-1,j-1,s,s2,dp);
     }

     return dp[i][j]=1+ Math.min(find(i-1,j-1,s,s2,dp),Math.min(find(i-1,j,s,s2,dp),find(i,j-1,s,s2,dp)));

    }
}