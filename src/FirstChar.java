
/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月19日下午8:56:48
 */
public class FirstChar {
    public int FirstNotRepeatingChar(String str) {
    	int[] c = new int[256];
    	if (str == null || str.length() == 0)return -1;
    	for (int i = 0; i < 256; i++){
    		c[i] = -1;
    	}
    	for (int i = 0; i < str.length(); i++){
    		if (c[str.charAt(i)] == -1){
    			c[str.charAt(i)] = i;
    		}
    		else{
    			c[str.charAt(i)] = -2;
    		}
    	}
    	int j = str.length();
    	for (int i = 0; i < 256; i++){
    		if (c[i] >= 0 && c[i] < j){
    			j = c[i];
    		}
    	}
    	if (j == str.length())j = -1;
    	return j;
    }
}
