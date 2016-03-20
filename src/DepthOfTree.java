/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月20日下午8:24:25
 */
public class DepthOfTree {
    public int TreeDepth(TreeNode root) {
        if (root == null)return 0;
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return left > right?left + 1:right + 1;
    }
}
