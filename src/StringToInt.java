/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月14日上午9:55:22
 * 
 * 注意： 要考虑字符串的正负问题
 */
public class StringToInt {
    public int StrToInt(String str) {
       int result = 0;
       boolean flag = true;
       int symbol = 1;
       if (str == null || str.length() == 0)return 0;
       if (str.charAt(0) == '+')symbol = 1;
       else if (str.charAt(0) == '-')symbol = -1;
       else if (str.charAt(0) - '0' >= 0 && str.charAt(0) - '0' <= 9)result = str.charAt(0) - '0';
       else flag = false;
       for (int i = 1; i < str.length() && flag; i++){
    	   if (str.charAt(i) - '0' >= 0 && str.charAt(i) - '0' <= 9){
    		   result = result * 10 + (str.charAt(i) - '0');
    	   }
    	   else flag = false;
       }
       if (flag){
    	   return result * symbol;
       }
       else
    	   return 0;
    }
}
