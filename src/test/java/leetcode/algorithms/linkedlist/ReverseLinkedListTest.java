package leetcode.algorithms.linkedlist;

import org.junit.Test;

public class ReverseLinkedListTest {

	@Test
	public void test(){
		ListNode head = ListNode.createListNode(new int[]{1,2});
		ListNode.printListNode(new ReverseLinkedList().reverseList(head));
	}
}
