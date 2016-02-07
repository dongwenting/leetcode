package leetcode.algorithms.linkedlist;

import org.junit.Test;

public class RemoveNthNodeFromEndofListTest {

	@Test
	public void test(){
		ListNode head = ListNode.createListNode(new int[]{1});
		ListNode.printListNode(new RemoveNthNodeFromEndofList().removeNthFromEnd(head, 1));
	}
}
