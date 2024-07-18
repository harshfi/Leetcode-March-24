class Solution {
    List<List<String>> list;
    public List<List<String>> partition(String ques) {
        list=new ArrayList<>();
        backtrack(ques,new ArrayList<>());
        return list;
    }
    public void backtrack(String ques, List<String> l){
        if(ques.length()==0){
            list.add(new ArrayList(l));
            return;
        }

        for(int i=1;i<=ques.length();i++){
            String tutaHua= ques.substring(0,i);
            if(isPal(tutaHua)){
                l.add(tutaHua);
                backtrack(ques.substring(i),l);
                l.remove(l.size()-1);
            }
        }
    }
    public boolean isPal(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}