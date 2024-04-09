class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int ele=tickets[k];
        int out=0;
        for(int i=0;i<tickets.length;i++) {
            if(tickets[i]>=ele) {
                if(i<=k)
                    out=out+ele;
                else 
                    out=out+ele-1;    
            }
            else {
                out=out+tickets[i];
            }
        }
        return out;
    }
}