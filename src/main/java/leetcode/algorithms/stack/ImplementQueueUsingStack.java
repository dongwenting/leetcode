package leetcode.algorithms.stack;

import java.util.Stack;

public class ImplementQueueUsingStack {
	Stack<Integer> stack = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        int size = stack.size();
        Stack<Integer> tmp = new Stack<Integer>();
        for(int i=0; i<size; i++){
        	tmp.push(stack.pop());
        }
        tmp.pop();
        size = tmp.size();
        for(int i=0; i<size; i++){
        	stack.push(tmp.pop());
        } 
    }

    // Get the front element.
    public int peek() {
        int size = stack.size();
        Stack<Integer> tmp = new Stack<Integer>();
        for(int i=0; i<size; i++){
        	tmp.push(stack.pop());
        }
        int ret = tmp.peek();
        size = tmp.size();
        for(int i=0; i<size; i++){
        	stack.push(tmp.pop());
        }
        return ret;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}
