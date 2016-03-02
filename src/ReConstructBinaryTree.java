/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月2日下午6:45:08
* 
* 根据前序和中序遍历结果重建二叉树
* 特别注意middle为中序遍历时root节点相对于起始位置的便宜
* 
*/

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre == null || in == null || pre.length != in.length)return null;
    	int pLength = pre.length;
        int inLength = in.length;
        return constructBinaryTree(pre, 0, pLength, in, 0, inLength);
    }
    
    public TreeNode constructBinaryTree(int[] pre, int pStart, int pEnd, int [] in, int inStart, int inEnd) {
    	TreeNode tN = new TreeNode(pre[pStart]);
    	tN.left = null; tN.right = null;
    	if (pEnd - pStart == 1){
    		if (inEnd - inStart == 1 && pre[pStart] == in[inStart])
    			return tN;
    	}
    	int middle = -1;
    	for (int i = inStart; i < inEnd; i++){
    		if (in[i] == pre[pStart]){
    			middle = i - inStart;
    			break;
    		}
    	}
    	if (middle + inStart > inStart){
    		tN.left = constructBinaryTree(pre, pStart + 1, pStart + middle + 1, in, inStart, inStart + middle);
    	}
    	if (inStart + middle + 1 < inEnd){
    		tN.right = constructBinaryTree(pre, pStart + middle + 1, pEnd, in, inStart + middle + 1, inEnd);
    	}
    	return tN;
    }
    
}
