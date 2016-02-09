package leetcode.algorithms.linkedlist;

import org.junit.Test;

public class RemoveDuplicatesFromSortedList2Test {

	@Test
	public void test(){
		ListNode head = ListNode.createListNode(new int[]{1,1,2,3});
		ListNode.printListNode(new RemoveDuplicatesFromSortedList2().deleteDuplicates(head));
	}
}
