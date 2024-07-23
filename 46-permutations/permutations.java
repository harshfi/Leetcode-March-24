class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> permute(int[] nums) {
        list=new ArrayList<>();
        per(nums,new ArrayList<>());
        return list;

    }
    public void per (int num[],List<Integer> l){
        if(num.length==l.size()){
            list.add(new ArrayList<>(l));
            return ;
        }
        for(int i=0;i<num.length;i++){
            if(l.contains(num[i])==false){
                l.add(num[i]);
                per(num,l);
                l.remove(l.size()-1);
            }
        }
    }
}