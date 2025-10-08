class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int ans[]= new int[spells.length];
        for(int i=0;i<spells.length;i++){
          ans[i]=bs(potions,spells[i],success);
        }
        return ans;
    }
    public int bs(int pos[],int a,long n){
        int count =0;
        int ans=pos.length;
        int i=0;
        int j=pos.length-1;
        while(i<=j){
            int mid= (i+j)/2;
            if((long)((long)a*(long)pos[mid])>=n){
                j=mid-1;
                ans=mid;
            }
            else i=mid+1;
        }
        return pos.length-ans;
    }
}