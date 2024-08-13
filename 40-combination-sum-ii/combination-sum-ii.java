class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> combinationSum2(int[] candidate, int target) {
        Arrays.sort(candidate);
         list=new ArrayList<>();
         int v[]=new int [51];
         Arrays.fill(v,-1);
        find(candidate,target,new ArrayList<>(),0,v);
        return list;
    }
     public void find(int candidate[],int target,List<Integer> l,int s,int v[]){
        if(target==0){
           
            list.add(new ArrayList<>(l));
            return;
        }

        for(int i=s;i<candidate.length;i++){
            if(i>s && candidate[i]==candidate[i-1]) continue;
            if(candidate[i]<=target   ){
                l.add(candidate[i]);
               
                find(candidate,target-candidate[i],l,i+1,v);
               
                l.remove(l.size()-1);
            }
        }
    }
}