class Solution {
    public void rotate(int[][] a) {
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }

       

        

        for(int i=0;i<n;i++){
            int s=0;
            int e=n-1;
            while(s<e){
                int temp=a[i][s];
                a[i][s]=a[i][e];
                a[i][e]=temp;
                s++;
                e--;
            }
        }
        
    }
    
}