import java.util.Stack;

/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月2日下午10:13:04
* 
* 用两个栈实现一个队列
* 
*/
public class QueueUseTwoStack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        while (!stack1.isEmpty()){
        	stack2.push(stack1.pop());
        }
        stack2.push(node);
    }
    
    public int pop() {
    	while (!stack2.isEmpty()){
    		stack1.push(stack2.pop());
    	}
    	return stack1.pop();
    }
}
