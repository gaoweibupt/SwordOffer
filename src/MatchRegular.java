/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月14日下午3:33:57
 * 
 * 如果第二个字符不是'*'则直接判断
 * 
 * 如果第二个字符为'*',有两种可能： pattern 向后移动两位； pattern 不动
 * 
 */
public class MatchRegular {
    public boolean match(char[] str, char[] pattern)
    {
    	if (str == null || pattern == null)return false;
    	if (str.length == 0)return match(pattern, 0);
    	return match(str, pattern, 0, 0);
    }
    public boolean match(char[] str, char[] pattern, int i, int j){
    	if (i == str.length)return match(pattern, j);
    	if (i > str.length || j > pattern.length)return false;
    	if (j + 1 < pattern.length && pattern[j + 1] == '*'){
    		if (str[i] == pattern[j] || pattern[j] == '.'){
    			return match(str, pattern, i + 1, j) || match(str, pattern, i, j + 2);
    		}
    		else
    			return match(str, pattern, i, j + 2);
    	}
    	if (j != pattern.length && (str[i] == pattern[j] || pattern[j] == '.'))
    		return match(str, pattern, i + 1, j + 1);
    	else
    		return false;
    }
    public boolean match(char[] pattern, int j){
    	if (j == pattern.length)return true;
    	if (j + 1 < pattern.length && pattern[j + 1] == '*'){
    		return match(pattern, j + 2);
    	}
    	return false;
    }
}
