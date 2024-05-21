class Solution {
    static List<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        l=new ArrayList<>();
        find(nums,new ArrayList<>(),0);
        return l;
    }
    public static void find(int nums[],List<Integer> list,int i){
        if(i>=nums.length){
            l.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        find(nums,list,i+1);
        list.remove(list.size()-1);
        find(nums,list,i+1);
    }
}