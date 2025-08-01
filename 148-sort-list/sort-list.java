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
     public ListNode sortList(ListNode head) {
	        
	    	return Sort(head);
	    	
	    }
	    public  ListNode Sort(ListNode head) {
	    	
	    	if(head==null || head.next==null)return head;
	    	
	    	ListNode mid=middleNode(head);
	    	
	    	ListNode midNext=mid.next;
	    	mid.next=null;
	    	
	    	ListNode A=Sort(head);
	    	ListNode B=Sort(midNext);
	    	
	    	return mergeTwoLists(A,B);
	    	
	    	
	    }
	    
	    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        
			 ListNode p1=list1;
			 ListNode p2=list2;
			 
			 ListNode d=new ListNode();
			 ListNode head=d;
			 
			 while(p1!=null && p2!=null) {
				 
				 if(p1.val> p2.val) {
					 d.next=p2;
					 p2=p2.next;
				 }
				 else {
					 d.next=p1;
					 p1=p1.next;
				 }
				 d=d.next;
			 }
			
			 while(p1!=null) {
				 d.next=p1;
				 p1=p1.next;
				 d=d.next;
			 }
			 while(p2!=null) {
				 d.next=p2;
				 p2=p2.next;
				 d=d.next;
			 }
			 
			 return head.next;
			 
		    }

	    public ListNode middleNode(ListNode head) {
	    	
	    	ListNode slow=head;
	    	ListNode fast=head;
	    	
	    	while(fast.next!=null && fast.next.next!=null) {
	    		fast=fast.next.next;
	    		slow=slow.next;
	    	}
	    	return slow;
	    }
}