/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月7日下午12:02:44
*/
public class MirrorOfTwoBinaryTree {
    public void Mirror(TreeNode root) {
        if (root == null){
        	return;
        }
        else{
        	TreeNode tmp;
        	tmp = root.left;
        	root.left = root.right;
        	root.right = tmp;
        	Mirror(root.left);
        	Mirror(root.right);
        }
    }
}
