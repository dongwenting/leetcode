package leetcode.algorithms.linkedlist;

public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {val = x;}
	
	public static ListNode createListNode(int[] nodes){
		ListNode head, p;
		p = head = new ListNode(nodes[0]);
		for(int i=1; i<nodes.length; i++){
			p.next = new ListNode(nodes[i]);
			p = p.next;
		}
		p.next = null;
		return head;
	}
	
	public static void printListNode(ListNode head){
		ListNode p = head;
		while(p != null){
			System.out.print(p.val+ "->");
			p = p.next;
		}
		System.out.print("null");
	}
}
