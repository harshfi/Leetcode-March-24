class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
       int sum=0;
       for(int i=0;i<worker.length;i++){
          sum=sum+profitMax(worker[i],difficulty,profit);
       } 
       return sum;
    }
    public int profitMax(int able,int[] diff, int[] profit){
        int maxMoney=0;
        for(int i=0;i<profit.length;i++){

            if(profit[i]>maxMoney && able>=diff[i]){
                maxMoney=profit[i];
            }
        }
        return maxMoney;
    }
}