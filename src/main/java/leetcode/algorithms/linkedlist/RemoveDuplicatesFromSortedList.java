package leetcode.algorithms.linkedlist;

import java.util.HashMap;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
    	if(head == null || head.next == null){
    		return head;
    	}  
    	HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    	ListNode pre = head, next = head.next;
    	map.put(pre.val, true);
    	while(next != null){
    		Boolean flag = map.get(next.val);
    		if(flag == null){
    			map.put(next.val, true);
    			pre = next;
    			next = next.next;
    		}else{
    			pre.next = next.next;
    			next = next.next;
    		}
    	}
    	return head;   
    }
}
