import java.util.Stack;

/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月7日下午10:51:47
*/
public class MinStack {
    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> stack = new Stack<>();
	public void push(int node) {
        if (minStack.isEmpty()){
        	minStack.push(node);
        	stack.push(node);
        }
        else{
        	if (minStack.peek() > node){
        		minStack.push(node);
        		stack.push(node);
        	}
        	else{
        		int tmp = minStack.peek();
        		minStack.push(tmp);
        		stack.push(node);
        	}
        }
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return minStack.peek();
    }
}
