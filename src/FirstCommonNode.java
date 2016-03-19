/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月19日下午9:24:44
 */
public class FirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	int i = 0, j = 0;
    	ListNode p1 = pHead1;
    	ListNode p2 = pHead2;
    	while (p1 != null){
    		i++;
    		p1 = p1.next;
    	}
    	while (p2 != null){
    		j++;
    		p2 = p2.next;
    	}
    	p1 = pHead1;
    	p2 = pHead2;
    	while (i > j){
    		p1 = p1.next;
    		i--;
    	}
    	while (j > i){
    		p2 = p2.next;
    		j--;
    	}
    	while (p1 != null && p1 != p2){
    		p1 = p1.next;
    		p2 = p2.next;
    	}
    	return p1;
    }
}
