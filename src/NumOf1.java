/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月3日下午7:21:52
*/
public class NumOf1 {
    public int NumberOf1(int n) {
    	int num = 0;
    	int flag = 1;
    	while (flag != 0){
    		if ((flag & n) != 0){
    			num ++;
    		}
    		flag = flag << 1;
    	}
    	return num;
    }
}
