import java.util.ArrayList;
import java.util.TreeSet;
/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月10日下午12:29:05
*/
public class ArrayString {
    public ArrayList<String> Permutation(String str) {
    	ArrayList<String> result = new ArrayList<>();
    	if (str == null || str.length() == 0)return result;
    	if (str.length() == 1){
    		result.add(str);
    		return result;
    	}
    	TreeSet<String> result1 = new TreeSet<>();
    	char[] s = str.toCharArray();
    	for (int i = 0; i < s.length; i++){
    		char t = s[i];
    		s[i] = s[0];
    		s[0] = t;
    		ArrayList<String> temp = Permutation(new String(s, 1, s.length - 1));
    		for (int j = 0; j < temp.size(); j++){
    			result1.add(Character.toString(s[0]) + temp.get(j));
    		}
    		s[0] = s[i];
    		s[i] = t;
    	}
    	result.addAll(result1);
    	return result;
    }
    public static void main(String[] args){
    	ArrayList<String> result = new ArrayString().Permutation("ab");
    	for (int i = 0; i < result.size(); i++){
    		System.out.println(result.get(i));
    	}
    }
}
