class Solution {
    public int numWaterBottles(int numBottles, int numEx) {
        int Tbottle=numBottles;
        int left=numBottles;
        while(left>=numEx){
            int change=left/numEx;
            Tbottle+=change;
            left=change+left%numEx;
        }
        return Tbottle;
    }
}