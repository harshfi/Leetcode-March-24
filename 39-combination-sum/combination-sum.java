class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> combinationSum(int[] candidate, int target) {
        list=new ArrayList<>();
        find(candidate,target,new ArrayList<>(),0);
        return list;
        
    }
    public void find(int candidate[],int target,List<Integer> l,int s){
        if(target==0){
            list.add(new ArrayList<>(l));
            return;
        }

        for(int i=s;i<candidate.length;i++){
            if(candidate[i]<=target){
                l.add(candidate[i]);
                find(candidate,target-candidate[i],l,i);
                l.remove(l.size()-1);
            }
        }
    }
}