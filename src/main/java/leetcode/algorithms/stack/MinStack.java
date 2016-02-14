package leetcode.algorithms.stack;

import java.util.Stack;

public class MinStack {
	Stack<Integer> stack = new Stack<Integer>();
	Integer min = Integer.MAX_VALUE;

	public void push(int x) {
       stack.push(x);
       if(x <= min){
    	   min = x;
       }
    }

    public void pop() {
        int ret = stack.pop();
        if(ret == min){
        	min = Integer.MAX_VALUE;
        	for(int i=0; i<stack.size(); i++){
        		if(stack.get(i) <= min){
        			min = stack.get(i);
        		}
        	}
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
       return min;
    }
}
