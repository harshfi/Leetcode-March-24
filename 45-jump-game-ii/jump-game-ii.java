class Solution {
    public int jump(int[] a)
    {
       
        int cm=0;
        int cr=0;
        int jump=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(i+a[i]>cm)
            {
                cm=i+a[i];
            }
            if(i==cr)
            {
                jump++;
                cr=cm;
            }
        }
       
        return jump;
    }
}