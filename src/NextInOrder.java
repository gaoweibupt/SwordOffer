/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月24日下午3:26:31
 */
public class NextInOrder {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
    	if (pNode == null)return null;
    	if (pNode.right != null){
    		pNode = pNode.right;
    		while (pNode.left != null){
    			pNode = pNode.left;
    		}
    		return pNode;
    	}
    	else{
    		TreeLinkNode p = pNode.next;
    		while (p != null && p.right == pNode){
    			pNode = p;
    			p = p.next;
    		}
    		return p;
    	}
    }
}



class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}