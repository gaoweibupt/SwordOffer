/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月20日下午8:30:53
 */
public class BalanceTree {
	class Int{
		int x;
	}
	
    public boolean IsBalanced_Solution(TreeNode root) {
    	return isBanlanced(root, new Int());
    }
    public boolean isBanlanced(TreeNode p, Int d){
    	if(p == null){
    		d.x = 0;
    		return true;
    	}
    	Int left = new Int(), right = new Int();
    	if (isBanlanced(p.left, left) && isBanlanced(p.right, right)){
    		int m = left.x - right.x;
    		if (m <= 1 && m >= -1){
    			d.x = 1 + (left.x > right.x? left.x: right.x);
    			return true;
    		}
    	}
    	return false;
    }
}