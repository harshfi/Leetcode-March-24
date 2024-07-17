class Solution {
    List<String> list;
    public List<String> generateParenthesis(int n) {
        list=new ArrayList<>();
        find(n,0,0,"");
        return list;
        
    }
    public void find(int n,int open,int close,String s){
        if(open==n &&close==n){
            list.add(s);
            return;
        }
        if(open<n){
            find(n,open+1,close,s+"(");

        }
        if(open>close)find(n,open,close+1,s+")");
    }
}