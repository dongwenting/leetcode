package leetcode.algorithms.linkedlist;

import org.junit.Test;

public class PalindromeLinkedListTest {
	@Test
	public void test(){
		ListNode head = ListNode.createListNode(new int[]{-16557,-8725,-29125,28873,-21702,15483,-28441,-17845,-4317,-10914,-10914,-4317,-17845,-28441,15483,-21702,28873,-29125,-8725,-16557});
		System.out.println(new PalindromeLinkedList().isPalindrome(head));
	}
}
