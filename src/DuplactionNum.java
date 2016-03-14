/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月14日上午10:19:46
 */
public class DuplactionNum {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
    	if(numbers == null || duplication == null || length > numbers.length || length < 0)return false;
    	int i = 0;
    	for (int j = 0; j < numbers.length; j++){
    		if (numbers[j] < 0 || numbers[j] > length - 1)return false;
    	}
    	while (i < length){
    		if (numbers[i] == i){
    			i++;
    		}
    		else{
    			if (numbers[numbers[i]] == numbers[i]){
    				duplication[0] = numbers[i];
    				return true;
    			}
    			int temp = numbers[i];
    			numbers[i] = numbers[temp];
    			numbers[temp] = temp;           //注意这里numbers[temp] 而不是 numbers[numbers[i]]
    		}
    	}
    	return false;
    }
}
