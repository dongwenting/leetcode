package leetcode.algorithms.linkedlist;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = length(headA);
        int lenB = length(headB);
        int diff;
        ListNode p = headA, q = headB;
        if(lenA > lenB){
        	 diff = lenA - lenB;
        	 for(int i=0; i<diff; i++){
        		 p = p.next;
        	 }
        }else if(lenA < lenB){
        	diff = lenB - lenA;
          	 for(int i=0; i<diff; i++){
        		 q = q.next;
        	 }        	
        }
       
        while(p != null && q != null){
        	if(p == q){
        		return p;
        	}
        	p = p.next;
        	q = q.next;		
        }
        return null;
    }
    
    public int length(ListNode node){
    	int i=0;
    	for(ListNode p = node;p != null; i++){
    		p = p.next;
    	}
    	return i;
    }
}
