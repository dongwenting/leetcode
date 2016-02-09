package leetcode.algorithms.linkedlist;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if(l1 == null){
    		return l2;
    	}
    	if(l2 == null){
    		return l1;
    	}
        ListNode head = l1.val < l2.val ? l1 : l2, s=head, p, q;
        if(l1.val < l2.val){
        	head = l1;
        	p = l1.next;
        	q = l2;
        }else{
        	head = l2;
        	p = l1;
        	q = l2.next;
        }
        s = head;
        while(p != null && q != null){
        	if(p.val < q.val){
        		s.next = p;
        		p = p.next;
        	}else{
        		s.next = q;
        		q = q.next;
        	}
        	s = s.next;
        }
        
        if(p == null){
        	s.next = q;
        }
        
        if(q == null){
        	s.next = p;
        }
        return head;
    }
}
