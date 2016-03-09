/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月9日下午11:34:12
*/
public class TreeConvert {
    public TreeNode Convert(TreeNode pRootOfTree) {
        	TreeNode phead = Convert(pRootOfTree, null);
        	while (phead != null && phead.left != null){
        		phead= phead.left;
        	}
        	return phead;
    }
    public TreeNode Convert(TreeNode root, TreeNode phead){
    	if (root == null){
    		return null;
    	}
    	if (root.left != null){
    		phead = Convert(root.left, phead);
    	}
    	root.left = phead;
    	if (phead != null){
    		phead.right = root;
    	}
    	phead = root;
    	if (root.right != null){
    		phead = Convert(root.right, phead);
    	}
    	return phead;
    }
}
