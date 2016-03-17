import java.util.ArrayList;

/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月17日下午9:54:46
 */
public class UglyNumber {
    public int GetUglyNumber_Solution(int index) {
        ArrayList<Integer> uglyNum = new ArrayList<>();
        if (index < 0)return -1;
        else if (index == 0)return 0;
        uglyNum.add(1);
        int n2 = 0, n3 = 0, n5 = 0;
        while(index != uglyNum.size()){
        	int n22 = uglyNum.get(n2) * 2;
        	int n33 = uglyNum.get(n3) * 3;
        	int n55 = uglyNum.get(n5) * 5;
        	if (n22 <= n33 && n22 <= n55){
        		uglyNum.add(n22);
        	}
        	else if (n33 <= n22 && n33 <= n55){
        		uglyNum.add(n33);
        	}
        	else if (n55 <= n33 && n55 <= n22){
        		uglyNum.add(n55);
        	}
        	if (n22 <= uglyNum.get(uglyNum.size() - 1)){
        		n2++;
        	}
        	if (n33 <= uglyNum.get(uglyNum.size() - 1)){
        		n3++;
        	}
        	if (n55 <= uglyNum.get(uglyNum.size() - 1)){
        		n5++;
        	}
        }
    	return uglyNum.get(index - 1);
    }
}
