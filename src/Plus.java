/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月21日下午7:25:50
 */
public class Plus {
    public int Add(int num1,int num2) {
        int sum = 0;
        int a = 0;
        do{
        	sum = num1 ^ num2;
        	a = (num1 & num2) << 1;
        	num1 = sum;
        	num2 = a;
        }
        while(a != 0);
        return sum;
    }
}
