/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月21日下午12:15:36
 */
public class ReserveWord {
    public String ReverseSentence(String str) {
    	if(str == null)return null;
    	String[] words = str.split(" ");
    	if (words.length == 0)return str;
    	String result = "";
    	for(int i = words.length - 1; i > 0; i--){
    		result = result + words[i] + " ";
    	}
    	result += words[0];
    	return result;
    }
}
