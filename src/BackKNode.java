/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月5日下午9:42:52
* 
* 注意边界条件，注意输入参数的合法性
* 
*/
public class BackKNode {
    public ListNode FindKthToTail(ListNode head,int k) {
    	if (head == null)return null;
    	if (k <= 0)return null;
    	ListNode hf = head;
    	ListNode hb = head;
    	while (k > 0 && hf != null){
    		hf = hf.next;
    		k--;
    	}
    	if (k == 0){
    		while (hf != null){
    			hf = hf.next;
    			hb = hb.next;
    		}
    		return hb;
    	}
    	else
    		return null;
    }
}
