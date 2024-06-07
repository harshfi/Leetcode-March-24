class Solution {
    public String replaceWords(List<String> d, String se) {

        Set<String> set=new HashSet<>();

        for(String i: d)set.add(i);
        String ss="";
        String []s=se.split(" ");

        for(String i: s){
            int t=0;
            for(int j=0;j<i.length();j++){
                 String str=i.substring(0,j+1);

                 if(set.contains(str)){
                   t=1;
                   ss=ss+" "+str;
                   break;
                 }
            }
            if(t==0)ss=ss+" "+i;
        }
        return ss.trim();

        
    }
}