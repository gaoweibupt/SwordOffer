/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2016年3月20日下午9:35:31
 * 
 * 边界条件要考虑清楚： 数组的长度，数组是不是合法的
 * 
 */
public class OneNumInArray {
	//num1,num2分别为长度为1的数组。传出参数
	//将num1[0],num2[0]设置为返回结果
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array == null || array.length == 1)return;
        int x = 0;
        for (int i = 0; i < array.length; i++){
        	x = x & array[i];
        }
        int y = 0;
        while ((x & 1) == 0 && y <= 32){
        	x = x >>> 1;
        	y++;
        }
        num1[0] = 0;
        num2[0] = 0;
        for(int i = 0; i < array.length; i++){
        	if (twoArray(array[i], y)){
        		num1[0] = num1[0] ^ array[i];
        	}
        	else{
        		num2[0] = num2[0] ^ array[i];
        	}
        }
    }
    public boolean twoArray(int x, int y){
    	x = x >>> y;
    	return (x & 1) == 0;
    }
}
