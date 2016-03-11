import java.util.ArrayList;

/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月11日下午8:59:58
*/
public class LittleKNum {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (input == null)return result;
        if (k > input.length || k == 0)return result;
        int start = 0, end = input.length;
        int index = Partition(input, 0, input.length);
        while(index != k - 1){
        	if (index > k - 1){
        		end = index;
        		index = Partition(input, start, end);
        	}
        	else{
        		start = index + 1;
        		index = Partition(input, start , end);
        	}
        }
        for (int i = 0; i < k; i++){
        	result.add(input[i]);
        }
        return result;
    }
    public  int Partition(int[] input, int start, int end){
    	int i = start, j = start;
    	int m = end - 1;
    	while (i <= m){                           //这个判断条件第一次错了，注意
    		if (input[i] <= input[j]){
    			int temp = input[i];
    			input[i] = input[j];
    			input[j] = temp;
    			j = i;
    			i++;
    		}
    		else{
    			int temp = input[m];
    			input[m] = input[i];
    			input[i] = temp;
    			m--;
    		}
    	}
    	return j;
    }
    
    public static void main(String[] args){
    	int[] input = {4,5,1,6,2,7,3,8};
    	System.out.println(new LittleKNum().Partition(input, 0, input.length));
    	ArrayList<Integer> result = new LittleKNum().GetLeastNumbers_Solution(input,1);
    	for (int i = 0; i < result.size(); i++){
    		System.out.println(result.get(i));
    	}
    }
}
