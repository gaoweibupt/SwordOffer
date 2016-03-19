/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月19日下午9:19:31
 * 
 * 仍然有bug 
 */
public class InversePairsNum {
    public int InversePairs(int [] array) {
        if (array == null)return 0;
        return sort(array, 0, array.length);
    }
    public int sort(int[] array, int s, int e){
    	 int result = 0;
    	 if (s == e || e - s == 1)return result;
    	 if (e - s == 2){
    		 if (array[s] <= array[e - 1]){
    		 }
    		 else{
    			 int temp = array[s];
    			 array[s] = array[e - 1];
    			 array[e - 1] = temp;
    			 result = 1;
    		 }
    	 }
    	 int m = (e + s) / 2;
    	 result += sort(array, s, m);
    	 result += sort(array, m, e);
    	 result += merge(array, s, m, e);
    	 return result;
    }
    public int merge(int[] array, int s, int m, int e){
    	int result = 0;
    	int[] a = new int[e - s];
    	int n = 0;
    	int i = s, j = m;
    	while (i != m || j != e){
    		if (i == m){
    			a[n] = array[j];n++;
				j++;
    		}
    		else if (j == e){
    			a[n] = array[i];n++;
    			i++;
    		}
    		else{
    			if (array[i] <= array[j]){
    				a[n] = array[i];n++;
    				i++;
    			}
    			else{
    				a[n] = array[j];n++;
    				result += (j - m + 1);
    				j++;
    			}
    		}
    	}
    	for (i = 0; i < e - s; i++){
    		array[i] = a[i];
    	}
    	return result;
    }
}
