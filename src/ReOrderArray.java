/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月4日下午11:17:24
*/
public class ReOrderArray {
    public void reOrderArray(int [] array) {
    	int[] array1 = new int[array.length];
    	for (int i = 0; i < array.length; i++){
    		array1[i] = array[i];
    	}
    	int j = 0;
    	for (int i = 0; i < array.length; i++){
    		if ((array1[i] & 1) == 1){
    			array[j] = array1[i];
    			j++;
    		}
    	}
    	for (int i = 0; i < array.length; i++){
    		if ((array1[i] & 1) == 0){
    			array[j] = array1[i];
    			j++;
    		}
    	}
    }
}
