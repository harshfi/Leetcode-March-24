class Solution {
    public List<String> commonChars(String[] w) {
       int a[]=new int[26];
       for(int i=0;i<w.length;i++){
        String s=w[i];
        if(i==0){
            for(int j=0;j<s.length();j++){
                a[s.charAt(j)-97]++;
            }
        }
        else {
            int b[]=new int[26];
           for(int j=0;j<s.length();j++){
            if( a[s.charAt(j)-97]>=1 &&  a[s.charAt(j)-97]>b[s.charAt(j)-97])b[s.charAt(j)-97]++;
            }
            a=b;
           
            
        }
       }
       List<String>list=new ArrayList<>();
       for(int i=0;i<26;i++){
        while(a[i]-->0){
            list.add(((char)(97+i)+""));
        }
       }
       return list;
    }
}