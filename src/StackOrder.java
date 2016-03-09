import java.util.Stack;

/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月8日下午2:40:43
*/
public class StackOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> tmp = new Stack<>();
        if (pushA.length == 0 || popA.length == 0)return false;
        int i = 0, j = 0;
        while ( j < popA.length){
        	if (!tmp.isEmpty() && tmp.peek() == popA[j]){
        		tmp.pop();
        		j++;
        	}
        	else{
        		if (i == pushA.length)return false;
        		tmp.push(pushA[i]);
        		i++;
        	}
        }
        return true;
    }
}
