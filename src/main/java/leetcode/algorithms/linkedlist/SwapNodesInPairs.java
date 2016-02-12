package leetcode.algorithms.linkedlist;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
        	return head;
        }

        ListNode p = head, q = head.next, s;
        head = q;
        p.next = q.next;
        q.next = p;
        s = p;
        p = p.next;
        if(p!=null){
        	q = p.next;
        }
        
        while(p!=null && q!=null){
        	p.next = q.next;
        	q.next = p;
        	s.next = q;
        	s = p;
        	p = p.next;
        	if(p != null){
        		q = p.next;
        	}
        }
        return head;
    }
}
