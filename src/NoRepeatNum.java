import java.util.ArrayList;

/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月15日上午10:54:36
 */
public class NoRepeatNum {
	int[] flag = new int[256];
	int j = 0;
	{
		for (int i = 0; i < 256; i++){
			flag[i] = -1;
		}
	}
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if (flag[ch] != -1){
        	flag[ch] = -2;
        }
        else{
        	flag[ch] = j;
        }
        j++;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    	int index = -1;
    	char c = '#';
    	for (int i = 0; i < 256; i++){
    		if (flag[i] != -1 && flag[i] != -2){
    			if (index == -1){
    				index = flag[i];
    				c = (char)i;
    			}
    			else{
    				if (index > flag[i]){
    					index = flag[i];
    					c = (char)i;
    				}
    			}
    		}
    	}
    	return c;
    }
}
