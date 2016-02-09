package leetcode.algorithms.linkedlist;

public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
    	if(node == null || node.next == null){
    		return ;
    	}
    	ListNode p = node, q = node;
    	while(p.next != null){
    		p.val = p.next.val;
    		p = p.next;
    	}
    	while(q.next != p){
    		q = q.next;
    	}
    	q.next = null;
    }
}
