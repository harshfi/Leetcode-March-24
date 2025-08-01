/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        
	    	int sizeA=size(headA);
	    	
	    	int sizeB=size(headB);
	    	
	    	int dif=Math.abs(sizeA-sizeB);
	    	
	    	if(sizeA>sizeB) {
	    		for (int i = 1; i <= dif; i++) {
					headA=headA.next;
				}
	    	}
	    	if(sizeB>sizeA) {
	    		for (int i = 1; i <= dif; i++) {
					headB=headB.next;
				}
	    	}
	    	
	    	while(headB!=headA) {
	    		
	    		headB=headB.next;
	    		headA=headA.next;
	    	}
	    	return headA;
	    	
	    	
	    }
	    public static int size(ListNode head) {
	    	int size=0;
	    	while(head!=null) {
	    		size++;
	    		head=head.next;
	    	}
	    	return size;
	    }
}