class Solution {
    List<List<Integer>> list= new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        int []v=new int[nums.length];
        find(nums,v,new ArrayList<>());
        return list;
        
    }
    public void find(int num[],int v[],List<Integer> l){
        if(l.size()==num.length){
            list.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<num.length;i++){
            if(v[i]==0){
                l.add(num[i]);
                v[i]=1;
                find(num,v,l);
                l.remove(l.size()-1);
                v[i]=0;
            }
        }
    }

}