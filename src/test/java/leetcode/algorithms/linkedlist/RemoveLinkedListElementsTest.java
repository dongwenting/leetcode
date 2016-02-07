package leetcode.algorithms.linkedlist;

import org.junit.Test;

public class RemoveLinkedListElementsTest {

	@Test
	public void test(){
		ListNode head = ListNode.createListNode(new int[]{1,2,2,1});
		ListNode.printListNode(new RemoveLinkedListElements().removeElements(head, 2));
	}
}
