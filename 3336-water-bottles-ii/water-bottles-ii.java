class Solution {
    public int maxBottlesDrunk(int numBottles, int numEx) {
        int left=numBottles;
        int t=numBottles;
        while(left>=numEx){
            left=left-numEx;
            numEx++;
            t++;
            left++;
            
        }
        return t;
    }
}