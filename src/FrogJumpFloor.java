/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月3日下午6:35:42
* 
* 斐波那契数列的应用
* 
*/
public class FrogJumpFloor {
    public int JumpFloor(int target) {
    	int f = 1;
    	int b = 2;
    	int result = 0;
    	if (target <= 0)
    		return 0;
    	else if (target == 1)
    		return f;
    	else if (target == 2)
    		return b;
    	else{
    		for (int i = 3; i <= target; i++){
    			result = f + b;
    			f = b;
    			b = result;
    		}
    		return result;
    	}
    }
    
    public int JumpFloorII(int target) {
    	int result = 1;
        if (target == 0)
            return 0;
        else{
            for (int i = 1; i < target; i++)
            {
                result *= 2;
            }
            return result;
        }
    }
}
