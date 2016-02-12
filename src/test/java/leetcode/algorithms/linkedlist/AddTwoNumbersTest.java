package leetcode.algorithms.linkedlist;

import org.junit.Test;

public class AddTwoNumbersTest {
	@Test
	public void test(){
		ListNode l1 = ListNode.createListNode(new int[]{9,8});
		ListNode l2 = ListNode.createListNode(new int[]{1});
		
		ListNode.printListNode(new AddTwoNumbers().addTwoNumbers(l1,l2));
	}
}
