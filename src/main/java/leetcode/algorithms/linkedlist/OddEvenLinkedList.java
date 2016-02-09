package leetcode.algorithms.linkedlist;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
    	if(head == null || head.next == null){
    		return head;
    	}
    	ListNode p = head, q = head.next, even = q;
    	while(p!=null && q!=null){
    		if(q.next !=null){
	    		p.next = q.next;
	    		p = p.next;
    		}
    		if(p!=null){
    			if(q.next != null){
    				q.next = p.next;
    			}
    			q = q.next;
    		}
    	}
    	p.next = even;
        return head;
    }
}
