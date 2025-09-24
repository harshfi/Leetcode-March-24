class Solution {
    public String fractionToDecimal(int nn, int dd) {
        boolean sign=false;
        if(nn==0)return "0";
        if((nn<0 && dd<0)||(nn>=0 && dd>=0))sign=true;
        StringBuilder sb= new StringBuilder();
       long n=(long)Math.abs(nn);
       long d=(long)Math.abs(dd);
    //    System.out.println(d);
       if(d<0)d=-1*d;
       if(n<0)n=-1*n;
        long q=n/d;
        long r=n%d;

        sb.append(q);
        if(r==0)return sign?sb.toString():"-"+sb.toString();
         
         else{
            sb.append('.');
            HashMap<Long,Integer> map=new HashMap<>();
            while(r!=0){
                if(map.containsKey(r)){

                   int pos= map.get(r);
                   sb.insert(pos,'(');
                   sb.append(')');
                   
                   return sign?sb.toString():"-"+sb.toString();

                }
                else{
                    map.put(r,sb.length());
                    // System.out.println(r+" "+q+" "+d);
                    r=r*10;
                    q=r/d;
                    r=r%d;

                    sb.append(q);

                }
            }
         }
         return sign?sb.toString():"-"+sb.toString();
    }
}