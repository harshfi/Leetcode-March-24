class Solution {
    // static {
    //     Runtime.getRuntime().addShutdownHook(new Thread(() -> {
    //         try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
    //             fw.write("0");
    //         } catch (Exception e) {
    //         }
    //     }));
    // }
    public int maxProfit(int[] p) {
        int n = p.length;
        
        int left[]= new int[p.length];

        int right[]= new int [p.length];
        int min=p[0];

        for(int i=1;i<p.length;i++){
            left[i]=Math.max(left[i-1],p[i]-min);
            min=Math.min(min,p[i]);
        }
        int tmax=0;
         int max=p[p.length-1];
        for(int i=p.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],max-p[i]);
            max=Math.max(max,p[i]);
            tmax=Math.max(tmax,left[i]+right[i]);
        }
        return tmax;




    }

    
}
