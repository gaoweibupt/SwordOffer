/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月15日下午9:32:45
 */
public class ListOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
    	if (pHead == null)return null;
    	ListNode p1 = pHead, p2 = pHead.next;
    	while(p2 != null && p2.next != null && p1 != p2){
    		p1 = p1.next;
    		p2 = p2.next.next;
    	}
    	if (p1 != p2)return null;
    	int i = 1;
    	p2 = p2.next;
    	while (p1 != p2){
    		p2 = p2.next;
    		i++;
    	}
    	p1 = pHead;
    	p2 = pHead;
    	while (i != 0){
    		p2 = p2.next;
    		i--;
    	}
    	while (p1 != p2){
    		p1 = p1.next;
    		p2 = p2.next;
    	}
    	return p1;
    }
}
