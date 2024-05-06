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
    public ListNode removeNodes(ListNode head) 
    {
        Stack <ListNode> st= new Stack<>();
        ListNode temp= head;
        while(temp!=null)
        {
            st.push(temp);
            temp=temp.next;
        }
        ListNode nn= new ListNode();
        ListNode pre=null;
        int max=Integer.MIN_VALUE;
        int size=st.size();
        for(int i=0;i<size;i++)
        {
            temp=st.pop();
            if(max<=temp.val)
            {
                nn.val=temp.val;
                nn.next=pre;
                max=temp.val;
                pre=nn;
                nn= new ListNode();
            }
        }
        return pre;
        
    }
}