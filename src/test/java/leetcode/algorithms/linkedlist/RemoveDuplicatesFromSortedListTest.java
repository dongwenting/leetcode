package leetcode.algorithms.linkedlist;

import org.junit.Test;

public class RemoveDuplicatesFromSortedListTest {

	@Test
	public void test(){
		ListNode head = ListNode.createListNode(new int[]{1});
		ListNode.printListNode(new RemoveDuplicatesFromSortedList().deleteDuplicates(head));
	}
}
