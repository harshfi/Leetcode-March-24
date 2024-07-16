class Solution {
    ArrayList<String> list;
    public List<String> letterCombinations(String digits) {
        String l[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        list=new ArrayList<>();
        if(digits.length()==0) return list;
        combination(l, "",digits,0);
        return list;
        }
        public  void combination(String l[],String s,String digits, int idx){
            if(digits.length()==idx) {
                list.add(s);
                return ;
            }
            String str = l[ digits.charAt(idx)-48];

            for(int i=0;i<str.length();i++){
               combination(l, s+str.charAt(i),digits,idx+1); 
            }
        }

}