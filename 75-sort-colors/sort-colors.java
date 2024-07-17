class Solution {
    public void sortColors(int[] nums) {
       int s=0;
       int i=0;
       int j=nums.length-1;

       while(i<=j){
         if(nums[i]==0){
            swap(nums,s,i);
            i++;
            s++;
         }
         else if(nums[i]==2){
            swap(nums,j,i);
            j--;

         }
         else i++;
       }
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}