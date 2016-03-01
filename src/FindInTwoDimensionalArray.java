/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月1日下午6:38:12
*/
public class FindInTwoDimensionalArray {
    public boolean Find(int [][] array,int target) {
    	if (array == null)return false;
    	int row = array.length;
    	int column = array[0].length;
    	int j = column - 1, i = 0;
    	//特别注意i，j的条件要在array前面，因为对array的访问可能越界
    	while (j >= 0 && array[i][j] > target){
    		j--;
    	}
    	//如果所有元素都大于target
    	if (j < 0)return false;
    	while (j >= 0 && i < row){
    		while (i < row && array[i][j] < target){
    			i++;
    		}
    		//最后一列的最大值都小于target，所有值小于target
    		if (i == row)return false;
    		if (array[i][j] == target)return true;
    		j--;
    	}
    	return false;
    }
}
