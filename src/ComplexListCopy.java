import java.util.HashMap;
import java.util.Map;

/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月9日下午12:09:21
*/

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class ComplexListCopy {
    public RandomListNode Clone(RandomListNode pHead)
    {
    	if (pHead == null)return null;
    	RandomListNode result = new RandomListNode(pHead.label);
    	RandomListNode temp = result, head = pHead;;
    	Map<RandomListNode, RandomListNode> stor = new HashMap<>();
    	stor.put(head, temp);
    	stor.put(null, null);
    	while (head.next != null){
    		temp.next = new RandomListNode(head.next.label);
    		stor.put(head.next, temp.next);
    		temp = temp.next;
    		head = head.next;
    	}
    	head = pHead;
    	temp = result;
    	while(head != null){
    		temp.random = stor.get(head.random);
    		temp = temp.next;
    		head = head.next;
    	}
    	return result;    	
    }
}
