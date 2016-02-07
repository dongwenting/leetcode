package leetcode.algorithms.linkedlist;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = head, next = head;
        for(int i=0; i<n; i++){
        	next = next.next;
        }
        while(next != null && next.next != null){
        	pre = pre.next;
        	next = next.next;
        }
        if(next == null){
        	head = pre.next;
        	pre.next = null;
        }else{
        	pre.next = pre.next.next;
        }
        return head;
    }
}
