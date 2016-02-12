package leetcode.algorithms.linkedlist;

import org.junit.Test;

public class RotateListTest {
	@Test
	public void test(){
		ListNode head = ListNode.createListNode(new int[]{1,2,3,4,5});
		ListNode.printListNode(new RotateList().rotateRight(head, 6));
	}
}
