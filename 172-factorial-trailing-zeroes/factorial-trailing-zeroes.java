class Solution {
    public int trailingZeroes(int n) {
        int cnt=0;
        int i=5;
        while(i<=n){
            cnt=cnt+(n/i);
            i=i*5;
        }

        return cnt;
    }
}