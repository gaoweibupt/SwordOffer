/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月6日下午1:49:12
*/
public class SubOfTree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null && root2 == null)return false;
        else if (root1 != null && root2 != null){
        	boolean flag = false;
        	if (root1.val == root2.val){
        		 flag = isSubTree(root1, root2);
        	}
        	if (!flag){
        		flag = HasSubtree(root1.left, root2);
        	}
        	if (!flag){
        		flag = HasSubtree(root1.right, root2);
        	}
        	return flag;
        }
        else return false;
    }
    public boolean isSubTree(TreeNode root1, TreeNode root2){
    	if (root2 == null)return true;
    	if (root1 == null)return false;
		if (root1.val == root2.val){
			if (isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right))
				return true;
			else
				return false;
		}
		else 
			return false;
    }
}
