import java.util.Arrays;

/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月21日下午5:06:27
 */
public class Poker {
    public boolean isContinuous(int [] numbers) {
    	if (numbers == null || numbers.length == 0)return false;
    	Arrays.sort(numbers);
    	int n = 0;
    	int i = 0;
    	for (i = 0; i < numbers.length; i++){
    		if(numbers[i] == 0){
    			n++;
    		}
    		else{
    			break;
    		}
    	}
    	int j = numbers[i] - 1;
    	for (; i < numbers.length; i++){
    		if (numbers[i] == j + 1){
    			j = j + 1;
    			continue;
    		}
    		else{
    			while (n != 0 && j  + 1 < numbers[i]){
    				n--; 
    				j++;
    			}
    			if (j + 1 == numbers[i]){
    				j = j + 1;
    			}
    			else
    				return false;
    		}
    	}
    	return true;
    }
}
