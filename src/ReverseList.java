/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月5日下午9:53:54
*/
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
    	if (head == null || head.next == null)return head;
    	ListNode hf = head.next.next;
    	ListNode hb = head;
    	ListNode hm = head.next;
    	hm.next = hb;
    	hb.next = null;
    	while (hf != null){
    		hb = hm;
    		hm = hf;
    		hf = hf.next;
    		hm.next = hb;
    	}
    	return hm;
    }
}
