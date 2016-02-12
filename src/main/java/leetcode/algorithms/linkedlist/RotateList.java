package leetcode.algorithms.linkedlist;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
    	if(head == null || head.next == null){
    		return head;
    	}
        ListNode p = head, q = head;
        int n =0;
        while(q != null){
        	n++;
        	q = q.next;
        }
        k = k % n;
        q = head;
        for(int i=0; i<k; i++){
        	q = q.next;
        }
      
        while(q.next != null){
        	q = q.next;
        	p = p.next;
        }
      
        q.next = head;
        head = p.next;
        p.next = null;
        return head;
    }
}
