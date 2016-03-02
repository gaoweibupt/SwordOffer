import java.util.ArrayList;
import java.util.Stack;

/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月2日下午6:35:07
*/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


public class PrintList {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> result = new ArrayList<>();
		Stack<Integer> temp = new Stack<>();
		while (listNode != null){
			temp.push(listNode.val);
			listNode = listNode.next;
		}
		while (!temp.isEmpty()){
			result.add(temp.pop());
		}
		return result;
    }
}
