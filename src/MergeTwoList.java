/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月5日下午10:47:49
*/
public class MergeTwoList {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode tmp = null,  head = null;
        if (list1 == null && list2 == null)return head;
        if (list1 != null && list2 != null){
        	if (list1.val < list2.val){
        		head = list1;
        		list1 = list1.next;
        	}
        	else{
        		head = list2;
        		list2 = list2.next;
        	}
        }
        else if (list1 == null || list2 == null){
        	if (list1 != null){
        		head = list1;
        		list1 = list1.next;
        	}
        	else if (list2 != null){
        		head = list2;
        		list2 = list2.next;
        	}
        }
        tmp = head;
    	while (list1 != null && list2 != null){
    		if (list1.val < list2.val){
    			tmp.next = list1;
    			list1 = list1.next;
    		}
    		else{
    			tmp.next = list2;
    			list2 = list2.next;
    		}
    		tmp = tmp.next;
        }
    	if (list1 == null)tmp.next = list2;
    	if (list2 == null)tmp.next = list1;
    	return head;
    }
}
