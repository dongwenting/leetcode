package leetcode.algorithms.stack;

import java.util.ArrayList;

public class ImplementStackUsingQueues {
	ArrayList<Integer> array = new ArrayList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        array.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
    	int size = array.size();
        for(int i=0; i<size - 1; i++){
        	array.add(array.remove(0));
        }
        array.remove(0);
    }

    // Get the top element.
    public int top() {
    	int size = array.size();
        for(int i=0; i<size - 1; i++){
        	array.add(array.remove(0));
        }
        int ret = array.remove(0);
        array.add(ret);
        return ret;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return array.isEmpty();
    }
}
