/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月24日下午2:58:28
 */
public class SymmetricTree {
    boolean isSymmetrical(TreeNode pRoot)
    {
        return siSymmetricalTree(pRoot, pRoot);
    }
    boolean siSymmetricalTree(TreeNode p1, TreeNode p2){
    	if (p1 == null && p2 == null)return true;
    	else if(p1 != null && p2 != null){
    		if (p1.val == p2.val){
    			return siSymmetricalTree(p1.left, p2.right) && siSymmetricalTree(p1.right, p2.left);
    		}
    		else
    			return false;
    	}
    	else
    		return false;
    }
}
