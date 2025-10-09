class Solution {
    public long minTime(int[] skill, int[] mana) {
        
      long potion[]= new long[skill.length];
      int max=0;
      for(int i=0;i<mana.length;i++){
         for(int j=0;j<skill.length;j++){
            if(j==0 )
            potion[j]+=(skill[j]*mana[i]);
            else
            potion[j]=Math.max(potion[j],potion[j-1])+skill[j]*mana[i];
         }
         
         for(int j=skill.length-2;j>=0;j--){
            potion[j]=potion[j+1]-(mana[i]*(skill[j+1]));
         }
        //  for(int j=0;j<skill.length;j++){
        //     System.out.print(potion[j]+" ");

        //  }
         System.out.println();
      }
      return potion[skill.length-1];


    }
}