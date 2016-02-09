package leetcode.algorithms.linkedlist;

public class RemoveDuplicatesFromSortedList2 {
	
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
        	return head;
        }
        ListNode cur = head, next = head.next;
        boolean flag;
        while(next != null){
        	flag =false;
	        while(cur != null && next != null && next.val == cur.val){
	        	cur = cur.next;
	        	next = next.next;
	        	flag = true;
	        }
	        if(flag){
		        cur = next;
		        head = cur;
		        if(cur != null){
		        	next = cur.next;
		        }
	        }else{
	        	break;
	        }
        }
        while(next!=null){
        	flag = false;
        	while(next.next != null && next.val == next.next.val){
        		next = next.next;
        		flag = true;
        	}
        	if(flag){
	        	cur.next = next.next;
	        	next = cur.next;
        	}else{
        		cur = cur.next;
        		next = next.next;
        	}
        }
    
        return head;
    }
}
