/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月15日下午9:51:47
 */
public class DeleteDuplicationNode {
    public ListNode deleteDuplication(ListNode pHead)
    {
    	if (pHead == null)return null;
    	ListNode p = pHead;
    	ListNode q = null;
    	while (p != null){
    		if (p.next  != null && p.val == p.next.val){
    			if (q == null){
    				while(p.next != null && p.val == p.next.val){
    					p = p.next;
    				}
    				p = p.next;
    				pHead = p;
    			}
    			else{
    				while(p.next != null && p.val == p.next.val){
    					p = p.next;
    				}
    				p = p.next;
    				q.next = p;
    			}
    		}
    		else{
    			q = p;
    			p = p.next;
    		}
    	}
    	return pHead;
    }
}
