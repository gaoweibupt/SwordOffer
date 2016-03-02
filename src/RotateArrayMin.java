/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月2日下午10:40:35
* 
* 要特别注意三个元素相同的情况，这种情况下只能顺序比较
* 另外要注意边界条件，当数组为空或者数组中的元素为0时的输出
* 
*/
public class RotateArrayMin {
    public int minNumberInRotateArray(int [] array) {
    	if (array == null || array.length == 0)return 0;
    	return minNumber(array, 0, array.length);
    }
    
    public int minNumber(int[] array, int Start, int End){
    	if (End - Start == 1){
    		return array[Start];
    	}
    	if (End - Start == 2){
    		return array[Start] > array[Start + 1]? array[Start + 1]:array[Start];
    	}
    	int middle = (Start + End) / 2;
    	if (array[Start] < array[End - 1]){
    		return array[Start];
    	}
    	else{
    		if (array[middle] < array[Start]){
    			return minNumber(array, Start + 1, middle + 1);
    		}
    		else if (array[middle] > array[Start]){
    			return minNumber(array, middle + 1, End);
    		}
    		else{
    			if (array[middle] == array[End - 1]){
    				int result = array[Start];
    				for (int i = Start; i < End; i++){
    					if (result > array[i])
    						result = array[i];
    				}
    				return result;
    			}
    			else{
    				return minNumber(array, middle + 1, End);
    			}
    		}
    	}
    }
}
