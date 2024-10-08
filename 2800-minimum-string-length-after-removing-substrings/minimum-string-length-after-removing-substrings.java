class Solution {
    public int minLength(String s) {
        for(int i=0;i<=s.length()-2;){
            String str=s.substring(i,i+2);
            if(str.equals("AB") ||str.equals("CD")){
                s=s.substring(0,i)+s.substring(i+2);
                i=i-1<0?0:i-1;
            }
            else i++;
        }
        return s.length();
        
    }
}