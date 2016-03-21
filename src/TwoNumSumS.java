import java.util.ArrayList;

/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月21日上午11:15:52
 */
public class TwoNumSumS {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        if (array == null || array.length <= 1)return result;
        int small = 0;
        int big = array.length - 1;
        while (array[small] + array[big] != sum && small < big){
        	if (array[small] + array[big] > sum){
        		big--;
        	}
        	else{
        		small++;
        	}
        }
        if(array[small] + array[big] == sum){
        	result.add(array[small]);
        	result.add(array[big]);
        }
        return result;
    }
}
