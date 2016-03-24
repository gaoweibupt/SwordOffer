import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月24日下午3:51:17
 */
public class PrintTree {
	
	//之字形打印
    public ArrayList<ArrayList<Integer> > Print1(TreeNode pRoot) {
    	ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    	Stack<TreeNode> p1 = new Stack<>();
    	Stack<TreeNode> p2 = new Stack<>();
    	if(pRoot != null)p1.push(pRoot);
    	while(p1.size() != 0 || p2.size() != 0){
    		TreeNode p;
    		ArrayList<Integer> r = new ArrayList<>();
    		if (p1.size() != 0){
    			while(p1.size() != 0){
    				p = p1.pop();
    				r.add(p.val);
    				if (p.left != null)p2.push(p.left);
    				if (p.right != null)p2.push(p.right);
    			}
    		}
    		else{
    			while(p2.size() != 0){
    				p = p2.pop();
    				r.add(p.val);
    				if (p.right != null)p1.push(p.right);
    				if (p.left != null)p1.push(p.left);
    			}
    		}
    		result.add(r);
    	}
    	return result;
    }
    
    
    
    
    //从左到右打印
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
    	ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    	LinkedList<TreeNode> p1 = new LinkedList<>();
    	LinkedList<TreeNode> p2 = new LinkedList<>();
    	if (pRoot != null)p1.offer(pRoot);
    	while (p1.size() != 0 || p2.size() != 0){
    		TreeNode p;
    		ArrayList<Integer> r = new ArrayList<>();
    		if (p1.size() != 0){
    			while (p1.size() != 0){
    				p = p1.poll();
    				r.add(p.val);
    				if (p.left != null)p2.offer(p.left);
    				if (p.right != null)p2.offer(p.right);
    			}
    		}
    		else{
    			while (p2.size() != 0){
    				p = p2.poll();
    				r.add(p.val);
    				if (p.left != null)p1.offer(p.left);
    				if (p.right != null)p1.offer(p.right);
    			}
    		}
    		result.add(r);
    	}
    	return result;
    }
}
