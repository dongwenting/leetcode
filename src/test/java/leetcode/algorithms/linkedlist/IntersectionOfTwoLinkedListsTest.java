package leetcode.algorithms.linkedlist;

import org.junit.Test;

public class IntersectionOfTwoLinkedListsTest {

	@Test
	public void test(){
		ListNode node = ListNode.createListNode(new int[]{1});
		System.out.println(new IntersectionOfTwoLinkedLists().length(node));
	}
}
