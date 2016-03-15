/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月15日上午9:30:06
 */
public class StringIsNum {
    public boolean isNumeric(char[] str) {
        if (str == null || str.length == 0)return false;
        int i = 0;
        if (str[i] == '+' || str[i] == '-')i++;
        if (i == str.length)return false;
        while (i < str.length && isZeroToNine(str[i])){
        	i++;
        }
        if (i == str.length)return true;     //全是数值
        if (str[i] == '.'){
        	i++;
        	while (i < str.length && isZeroToNine(str[i])){
            	i++;
            }
            if (i == str.length)return true;             //为小数
            if (str[i] == 'e' || str[i] == 'E'){         //科学计数法
            	i++;
            	if (i == str.length)return false;
            }
            if (str[i] == '+' || str[i] == '-')i++;
        	if (i == str.length)return false;
        	while (i < str.length && isZeroToNine(str[i])){
            	i++;
            }
            if (i == str.length)return true;
            return false;
        }
        else if (str[i] == 'e' || str[i] == 'E'){         //科学计数法
        	i++;
        	if (i == str.length)return false;
        	if (str[i] == '+' || str[i] == '-')i++;
        	if (i == str.length)return false;
        	while (i < str.length && isZeroToNine(str[i])){
            	i++;
            }
            if (i == str.length)return true;
            return false;
        }
        else
        	return false;
    }
    public boolean isZeroToNine(char s){
    	if (s - '0' >= 0 && s - '0' <= 9){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
}
