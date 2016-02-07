package leetcode.algorithms.linkedlist;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre, cur = head;
        while(cur!= null && cur.val == val){
        	head = cur.next;
        	cur = cur.next;
        }
        if(head == null){
        	return null;
        }
        pre = head;
        cur = head.next;
        while(cur != null){
        	if(cur.val == val){
        		pre.next = cur.next;
        		cur = cur.next;
        	}else{
	        	pre = cur;
	        	cur = cur.next;
        	}
        }
        return head;
    }
}
