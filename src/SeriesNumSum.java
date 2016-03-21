import java.util.ArrayList;

/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月21日上午10:22:35
 */
public class SeriesNumSum {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    	int small = 1, big = 2;
        int r = 3;
        while (small <= (sum / 2) && small < big){
        	if (r < sum){
        		big++;
        	}
        	else if (r == sum){
        		ArrayList<Integer> t = new ArrayList<>();
        		for (int i = small; i <= big; i++){
        			t.add(i);
        		}
        		result.add(t);
        		big++;
        		r = 0;
        	}
        	else{
        		small++;
        	}
        	r = 0;
    		for(int i = small; i <= big; i++){
    			r += i;
    		}
        }
        return result;
    }
    
}
