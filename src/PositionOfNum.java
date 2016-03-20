/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月20日上午11:08:25
 */
public class PositionOfNum {
    public int GetNumberOfK(int [] array , int k) {
    	if (array == null && array.length == 0)return 0;
    	int f = findFirstK(array, 0, array.length, k);
    	if (f == -1)return 0;
    	int b = findLastK(array, 0, array.length, k);
    	return b - f + 1;
    }
    public int findFirstK(int[] array, int s, int e, int k){
    	if (s == e)return -1;
    	if (s == e - 1)return array[s] == k?s:-1;
    	int m = (s + e) / 2;
    	if (array[m] > k){
    		return findFirstK(array, s, m, k);
    	}
    	else if (array[m] < k){
    		return findFirstK(array, m + 1, e, k);
    	}
    	else{
    		if (m - 1 >= s && array[m - 1] == k){
    			return findFirstK(array, s, m, k);
    		}
    		else return m;
    	}
    }
    public int findLastK(int[] array, int s, int e, int k){
    	if (s == e)return -1;
    	if (s == e - 1)return array[s] == k?s:-1;
    	int m = (s + e) / 2;
    	if (array[m] > k){
    		return findLastK(array, s, m, k);
    	}
    	else if (array[m] < k){
    		return findLastK(array, m + 1, e, k);
    	}
    	else{
    		if (m + 1 < e && array[m + 1] == k){
    			return findLastK(array, m + 1, e, k);
    		}
    		else return m;
    	}
    }
    
    public static void main(String[] args){
    	int[] array = {3,3,3,3,4,5};
    	System.out.println(new PositionOfNum().GetNumberOfK(array, 3));
    }
}
