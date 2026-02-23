class Solution {

    public boolean isDigitorialPermutation(int n) {
        int fact[]=new int [10];
        fact[0]=1;

        for(int i=1;i<=9;i++)fact[i]=fact[i-1]*i;
         
         int ans=0;
        
        int x=n;

         while(x>0){
            ans+=fact[x%10];
            x/=10;
         }
         return find(n,ans);

    }

    public boolean find(int n, int ans){

       int d[]=new int[10];
       int a[]=new int [10];

       while(n>0){
        d[n%10]++;
        n=n/10;
       }
      
      while(ans>0){
        a[ans%10]++;
        ans=ans/10;
      }

      for(int i=0;i<=9;i++){
        if(a[i]!=d[i])return false;
      }

     return true;
     
    }
    
}