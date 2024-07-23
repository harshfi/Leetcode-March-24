class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        list=new ArrayList<>();
        combSum(candidates,target,0,new ArrayList<>());
        return list;
        
    }
    public void combSum(int []coins,int target,int s, List<Integer> ll){
        if(target==0){
              list.add(new ArrayList<>(ll));
              return;
        }
        for(int i=s;i<coins.length;i++){
            if(target>=coins[i]){
                ll.add(coins[i]);
                combSum(coins,target-coins[i],i,ll);
                ll.remove(ll.size()-1);
            }
        }
    }
}