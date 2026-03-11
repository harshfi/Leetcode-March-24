class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l= new ArrayList<>();
        find(l,n,0,0,"");
        return l;
    }
    public void find( List<String> l, int n, int o, int c, String ans){
        if(o==c && o==n){
            l.add(ans);
            return;
        }
        if(c>n || o>n)return;
        
        find(l,n,o+1,c,ans+"(");

        if(o>c)
        find(l,n,o,c+1,ans+")");
    }
}