class Solution {
    public int passThePillow(int n, int time) {
        int d=time/(n-1);
        return d%2==0?time%(n-1)+1:(n - time % (n - 1));
    }
}