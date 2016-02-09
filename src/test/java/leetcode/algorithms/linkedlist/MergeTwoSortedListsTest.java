package leetcode.algorithms.linkedlist;

import org.junit.Test;

public class MergeTwoSortedListsTest {
	
	@Test
	public void test(){
		ListNode l1 = ListNode.createListNode(new int[]{1});
		ListNode l2 = ListNode.createListNode(new int[]{2});
		
		ListNode.printListNode(new MergeTwoSortedLists().mergeTwoLists(l1,l2));
	}
	
}
