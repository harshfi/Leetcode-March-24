class Solution {
    public int minTimeToVisitAllPoints(int[][] p) {
        int sum=0;
        for(int i=0;i<p.length-1;i++){
            sum+=Math.max(Math.abs(p[i][0]-p[i+1][0]),Math.abs(p[i][1]-p[1+i][1]));
        }
        return sum;
    }
}