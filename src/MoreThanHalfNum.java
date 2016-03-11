/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月11日下午8:31:42
*/
public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        int m = 0, n = 0;
        if (array == null || array.length == 0)return 0;
        for (int i = 0; i < array.length; i++){
        	if (array[i] == m){
        		n++;
        	}
        	else{
        		if (n == 0){
        			m = array[i];
        			n++;
        		}
        		else{
        			n--;
        		}
        	}
        }
        n = 0;
        for (int i = 0; i < array.length; i++){
        	if (array[i] == m){
        		n++;
        	}
        }
        if (n > array.length / 2){
        	return m;
        }
        else
        	return 0;
    }
}
