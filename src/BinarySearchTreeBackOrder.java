/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月8日下午10:48:37
*/
public class BinarySearchTreeBackOrder {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null)return false;
        return isBinarySearchTree(sequence, 0, sequence.length);
    }
    public boolean isBinarySearchTree(int[] sequence, int f, int b){
    	if (b - f <= 0)return false;
    	int p = f;
    	while (sequence[p] < sequence[b - 1]){
    		p++;
    	}
    	int pos = p;
    	while (sequence[p] > sequence[b - 1]){
    		p++;
    	}
    	if (p != b - 1)return false;
    	boolean left = true;
    	if (pos - f > 1){
    		left = isBinarySearchTree(sequence, f, pos);
    	}
    	boolean right = true;
    	if (b-1 - pos > 1){
    		right = isBinarySearchTree(sequence, pos, b - 1);
    	}
    	return left && right;
    }
}
