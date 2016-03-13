/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月13日下午5:21:48
 */
public class MaxSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        int temp, max = 0;
        if (array == null || array.length == 0)return max;
        temp = array[0];
        max = temp;
        for (int i = 1; i < array.length; i++){
        	temp += array[i];
        	if (temp < array[i]){
        		temp = array[i];
        	}
        	if (temp > max){
        		max = temp;
        	}
        }
        return max;
    }
}
