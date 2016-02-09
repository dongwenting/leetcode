package leetcode.algorithms.linkedlist;

import java.util.ArrayList;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
    	ArrayList<Integer> array = new ArrayList<Integer>();
    	while(head!=null){
    		array.add(head.val);
    		head = head.next;
    	}
    	for(int i=0; i<array.size()/2; i++){
    		int a = array.get(i);
    		int b = array.get(array.size()-1-i);
    		if(a != b){
    			return false;
    		}
    	}
        return true;
    }
}
