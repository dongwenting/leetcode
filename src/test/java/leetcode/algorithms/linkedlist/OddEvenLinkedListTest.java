package leetcode.algorithms.linkedlist;

import org.junit.Test;

public class OddEvenLinkedListTest {
	@Test
	public void test(){
		ListNode head = ListNode.createListNode(new int[]{1,2,3,4,5,6});
		ListNode.printListNode(new OddEvenLinkedList().oddEvenList(head));
	}
}
