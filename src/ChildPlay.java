import java.util.ArrayList;

/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月21日下午6:42:44
 */
public class ChildPlay {
    public int LastRemaining_Solution(int n, int m) {
    	ArrayList<Integer> temp = new ArrayList<Integer>();
    	if (n == 0)return -1;
    	for (int i = 0; i < n; i++){
    		temp.add(i);
    	}
    	int x = 1;
    	int y = 0;
    	while (temp.size() != 1){
    		if (x < m){
    			x++;
    			y++;
    		}
    		else if (x == m){
    			temp.remove(y);
    			x = 1;
    		}
    		if (y == temp.size()){
    			y = 0;
    		}
    	}
    	return temp.get(0);
    }
}
