/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月1日下午11:58:00
* 
* 剑指offer 第4题， 替换空格
* 将空格替换成%20                     
* 
*/
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
    	char[] s = str.toString().toCharArray();
    	StringBuffer sb = new StringBuffer();
    	for (int i = 0; i < s.length; i++)
    	{
    		if (s[i] == ' '){
    			sb.append("%20");
    		}
    		else{
    			sb.append(s[i]);
    		}
    	}
    	return sb.toString();
    }
    public String replaceSpace1(StringBuffer str){
    	
    }
}
