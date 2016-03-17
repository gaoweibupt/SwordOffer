
import java.util.Arrays;
import java.util.Comparator;


/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月17日下午2:55:43
 * 学会了比较器怎么写
 * 
 */
public class MinNumber{
    public String PrintMinNumber(int [] numbers) {
    	if (numbers == null)return null;
    	String[] r = new String[numbers.length];
    	for (int i = 0; i < numbers.length; i++){
    		r[i] = Integer.toString(numbers[i]);
    	}
    	//Arrays.sort(r, MinNumber.Compartors.getCompartors());
    	Arrays.sort(r, new Comparator<String>() {
    		@Override
    		public int compare(String o1, String o2) {
    			// TODO Auto-generated method stub
    			String a = o1 + o2;
    			String b = o2 + o1;
    			return a.compareTo(b);
    		}
		});
    	StringBuffer sb = new StringBuffer();
    	for (int i = 0; i < r.length; i++){
    		sb.append(r[i].toString());
    	}
    	return sb.toString();
    }

    static class Compartors implements Comparator<String>{
    	public static MinNumber.Compartors getCompartors(){
    		return new MinNumber.Compartors();
    	}
		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			String a = o1 + o2;
			String b = o2 + o1;
			return a.compareTo(b);
		}
    }
}
