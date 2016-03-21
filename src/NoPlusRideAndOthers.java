/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月21日下午7:12:20\
 * 
 * 不能使用乘除法
 * 
 */
public class NoPlusRideAndOthers {
    public int Sum_Solution(int n) {
    	if (n == 0)return 0;
    	if (n == 1)return 1;
    	return Sum_Solution(n-1) + n;
    }
}
