package leetcode.algorithms.linkedlist;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	if(l1 == null){
    		return l2;
    	}
    	if(l2 == null){
    		return l1;
    	}
        ListNode p = l1.next, q = l2.next, s = new ListNode((l1.val+l2.val)%10),head = s;
        boolean flag = (l1.val+l2.val)>=10?true:false;
        while(p != null && q != null){
        	int n = p.val + q.val;
        	if(flag){
        		n = n+1;
        	}
        	if(n >= 10){
        		s.next = new ListNode(n % 10);
        		flag = true;
        	}else{
        		s.next = new ListNode(n);
        		flag = false;
        	}
        	s = s.next;
        	p = p.next;
        	q = q.next;
        }
        
        while(p!=null){
        	int n = p.val;
        	if(flag){
        		n += 1;
        	}
        	if(n>=10){
        		s.next = new ListNode(n%10);
        		flag = true;
        	}else{
        		s.next = new ListNode(n);
        		flag = false;       		
        	}
        	s = s.next;
        	p = p.next;
        }
        while(q!=null){
        	int n = q.val;
        	if(flag){
        		n += 1;
        	}
        	if(n>=10){
        		s.next = new ListNode(n%10);
        		flag = true;
        	}else{
        		s.next = new ListNode(n);
        		flag = false;       		
        	}
        	s = s.next;
        	q = q.next;
        }   
        
        if(flag){
        	s.next = new ListNode(1);
        	s.next.next = null;
        }
        return head;
    }
    
}
