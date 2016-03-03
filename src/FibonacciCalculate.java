/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月3日下午6:23:34
*/
public class FibonacciCalculate {
    public int Fibonacci(int n) {
    	int f = 0;
    	int b = 1;
    	int result = 0;
    	if (n <= 0){
    		return 0;
    	}
    	else if (n == 1){
    		return 1;
    	}
    	else{
    		for (int i = 2; i <= n; i++){
    			result = f +b;
    			f = b;
    			b = result;
    		}
    		return result;
    	}
    }
}
