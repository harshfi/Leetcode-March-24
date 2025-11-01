/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode n=null;
        ListNode h= null;
      
        int arr[]= new int[(int)(1e5+1)];

        for(int i=0;i<nums.length;i++)arr[nums[i]]++;
        
        while(head!=null){
            if(arr[head.val]!=0){
                head=head.next;
            }
            else{
                if(n==null){
                  h=head;
                  n=head;

                //   System.out.println("Head"+ h.val);
                  
                }
                else{
                   
                    n.next=head;
                    n=head;
                }
                head=head.next;
            //  System.out.println(n.val);
            }
        }
        n.next=null;
        return h;
    }
}