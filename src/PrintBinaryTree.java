import java.util.ArrayList;
import java.util.LinkedList;

/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月8日下午3:08:38
*/
public class PrintBinaryTree {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<>();
		LinkedList<TreeNode> tmp = new LinkedList<>();
		while (root != null){
			result.add(root.val);
			if (root.left != null)tmp.offer(root.left);
			if (root.right != null)tmp.offer(root.right);
			root = tmp.poll();
		}
		return result;
    }

}
