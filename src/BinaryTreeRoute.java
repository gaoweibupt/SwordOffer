import java.util.ArrayList;

/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月8日下午11:09:08
*/
public class BinaryTreeRoute {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        return findPossiblePath(root, target, temp, result);
    }
    public ArrayList<ArrayList<Integer>> findPossiblePath(TreeNode root, int target, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> result){
    	if (root == null)return result;
    	if (root.left == null && root.right == null){
    		int sum = 0;
    		for (int i = 0; i < temp.size(); i++){
    			sum += temp.get(i);
    		}
    		if (sum + root.val == target){
    			ArrayList<Integer> r = new ArrayList<>(temp);
    			r.add(root.val);
    			result.add(r);
    		}
    		return result;
    	}
    	else{
    		temp.add(root.val);
    		if (root.left != null){
    			result = findPossiblePath(root.left, target, temp, result);
    		}
    		if (root.right != null){
    			result = findPossiblePath(root.right, target, temp, result);
    		}
    		temp.remove(temp.size() - 1);
    	}
    	return result;
    }
}
