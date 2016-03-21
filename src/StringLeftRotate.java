import java.util.Arrays;

/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月21日下午12:37:46
 */
public class StringLeftRotate {
    public String LeftRotateString(String str,int n) {
        if(str == null || str.length() == 0)return str;
        while (n > str.length()){
        	n = n - str.length();
        }
        char[] s = new char[str.length()];
        int j = 0;
        for (int i = str.length() - n; i < str.length(); i++){
        	s[i] = str.charAt(j);
        	j++;
        }
        for (int i = 0; i < str.length() - n; i++){
        	s[i] = str.charAt(j);
        	j++;
        }
        return String.valueOf(s);
    }
    
    public static void main(String[] args){
    	System.out.println(new StringLeftRotate().LeftRotateString("hello", 1));
    }
}
