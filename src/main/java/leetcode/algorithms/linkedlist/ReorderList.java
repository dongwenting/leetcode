package leetcode.algorithms.linkedlist;

import java.util.HashMap;

public class ReorderList {
	
    public void reorderList(ListNode head) {
    	if(head == null || head.next == null){
    		return ;
    	}
        HashMap<Integer, ListNode> map = new HashMap<Integer,ListNode>();
        ListNode p = head;
        int n=0;
        while(p != null){
        	map.put(n++, p);
        	p = p.next;
        }
        p = head;
        p.next = map.get(n-1);
        p = p.next;
        for(int i=1; i<=(n-1)/2; i++){
        	p.next = map.get(i);
        	p = p.next;
        	if((n-1) != i*2){
        		p.next = map.get(n-1-i);
        		p = p.next;
        	}
        }
        p.next = null;
    }
}
