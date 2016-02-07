package leetcode.algorithms.linkedlist;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
    	if(head == null || head.next == null){
    		return head;
    	}        
        ListNode pre = head, cur = head.next, next;
        pre.next = null;
        do{
        	next = cur.next;
        	cur.next = pre;
        	pre = cur;
        	cur = next;
        }while(cur != null);
        return pre; 
    }
}
