package leetcode.algorithms.linkedlist;

import org.junit.Test;

public class ReorderListTest {

	@Test
	public void test(){
		ListNode head = ListNode.createListNode(new int[]{1,2,3,4});
		new ReorderList().reorderList(head);
		ListNode.printListNode(head);
	}
}
