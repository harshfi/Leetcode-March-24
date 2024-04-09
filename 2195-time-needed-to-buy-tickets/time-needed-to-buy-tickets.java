class Solution {
    public int timeRequiredToBuy(int[] a, int k) {
        int s=0;
        while(true)
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[i]--;
                s++;
            }
            if(a[k]==0)return s;

        }
        
        
    }
}